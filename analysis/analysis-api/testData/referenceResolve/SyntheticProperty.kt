// FILE: main.kt
fun JavaClass.foo(javaClass: JavaClass) {
    print(javaClass.<caret>something)
}

// FILE: JavaClass.java
class JavaClass {
    public int getSomething() { return 1; }
    public void setSomething(int value) {}
}