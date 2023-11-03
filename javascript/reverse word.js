function reverseWords(str) {
    let st = [];
    for (let i = 0; i < str.length; ++i) {
    if (str[i] != ' ')
    st.unshift(str[i]);
    else {
    while (st.length != 0) {
    process.stdout.write(st[0]);
    st.shift();
    }
    process.stdout.write(' ');
    }
    }
 
    while (st.length != 0) {
    process.stdout.write(st[0]);
    st.shift();
}
}

let str = "This is a sunny day";
reverseWords(str);