do_compile:prepend() {
    for object in ${B}/lib/ext2fs/*.o; do
        [ -e "$object" ] || continue
        shared_object="${B}/lib/ext2fs/elfshared/$(basename "$object")"
        if [ ! -e "$shared_object" ]; then
            rm -f "$object"
        fi
    done
}
