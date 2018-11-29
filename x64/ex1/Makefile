
all: build run

build:
	@echo Building...
	@nasm -f elf64 -o hello.o ex1.asm;
	@ld -o hello.out hello.o

run:
	@echo Running...
	@./hello.out