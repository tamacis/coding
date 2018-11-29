# Highly portable makefile

GCC_FLAGS := -O0

all: build clock test

build:
	@echo Compiling.
	@gcc $(GCC_FLAGS) array_max_min.c -o array_max_min

clock:
	@./array_max_min resolution;
	@echo;

ass:
	gcc -S -O3 array_max_min.c

test:
	@n=1 ; while [[ $$n -le 5 ]] ; do \
	echo $$n ; \
	printf "recursive: "; \
	./array_max_min recursive test; \
	printf "naive: "; \
	./array_max_min naive test; \
	echo; \
	((n = n + 1)) ; \
	done

