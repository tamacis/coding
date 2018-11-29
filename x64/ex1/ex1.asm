;; https://0xax.github.io/asm_1/

; rax - temporary register; when we call a syscall, rax must contain syscall number
; rdx - used to pass 3rd argument to functions
; rdi - used to pass 1st argument to functions
; rsi - pointer used to pass 2nd argument to functions

; We just made a syscall to sys_write
; size_t sys_write(unsigned int fd, const char * buf, size_t count);

; It has 3 arguments:
;     fd - file descriptor. Can be 0, 1 and 2 for standard input, standard output and standard error
;     buf - points to a character array, which can be used to store content obtained from the file pointed to by fd.
;     count - specifies the number of bytes to be written from the file into the character array

section .data
    msg db      "hello, world!"

section .text
    global _start
_start:
    mov     rax, 1
    mov     rdi, 1
    mov     rsi, msg
    mov     rdx, 13
    syscall
    mov    rax, 60
    mov    rdi, 0
    syscall

; So we know that sys_write syscall takes three arguments and has number one in syscall table.
; Let’s look again to our hello world implementation. 
; We put 1 to rax register, it means that we will use sys_write system call. 
; In next line we put 1 to rdi register, it will be first argument of sys_write, 1 - standard output. 
; Then we store pointer to msg at rsi register, it will be second buf argument for sys_write. 
; And then we pass the last (third) parameter (length of string) to rdx, it will be third argument 
; of sys_write. Now we have all arguments of the sys_write and we can call it with syscall function 
; at 11 line. 
; Ok, we printed “Hello world” string, now need to do correctly exit from program. 
; We pass 60 to rax register, 60 is a number of exit syscall. 
; And pass also 0 to rdi register, it will be error code, so with 0 our program must exit successfully. 
; That’s all for “Hello world”. Quite simple :) 

