IMAGE_NAME=tomcat-8
CONTAINER_NAME=tomcat-local
PUBLIC_WWW_DIR='~/web_pages'

echo "Running container '$CONTAINER_NAME'... from '$IMAGE_NAME' "

case "$1" in
"build")
	docker build -t "$IMAGE_NAME" .
	;;
"run")
	docker start $CONTAINER_NAME >/dev/null 2>/dev/null || {
		echo "Creating new container..."
		docker run \
			--detach \
			-p 8888:8080 \
			--name $CONTAINER_NAME \
			--tty \
			-v ~/web_pages:/www \
			$IMAGE_NAME
	}
	;;
*)
	if [ "$#" -eq "0" ]; then
		docker exec --interactive --tty $CONTAINER_NAME bash
	else
		docker exec --interactive --tty $CONTAINER_NAME $@
	fi
	;;
esac
