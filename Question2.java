protected class Question2 {
    public static void main(String[] args) {
        ScopeDemo demo = new ScopeDemo();
        demo.publicMethod();
        demo.protectedMethod();
        demo.defaultMethod();
        demo.callPrivateMethod();
    }
}

class ScopeDemo {
    public void publicMethod() {
        System.out.println("\nPublic method: Accessible from anywhere.");
    }
    
    protected void protectedMethod() {
        System.out.println("\nProtected method: Accessible within the package and subclasses.");
    }
    
    void defaultMethod() {
        System.out.println("\nDefault (package-private) method: Accessible within the same package.");
    }
    
    private void privateMethod() {
        System.out.println("\nPrivate method: Accessible only within this class.");
    }
    
    public void callPrivateMethod() {
        System.out.println("\nAccessing private method indirectly:");
        privateMethod();
    }
}
