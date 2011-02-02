import checkers.util.test.*;

// @skip-test
class ArraySubtyping {
    Object[] obj1 = new Object[1];
    @Odd Object[] obj2 = new @Odd Object[1];

    String[] str1 = new String[1];
    @Odd String[] str2 = new @Odd String[1];
    
    void m() {
        //:: (assignment.type.incompatible)
        obj1 = obj2;
        //:: (assignment.type.incompatible)
        obj2 = obj1;

        //:: (assignment.type.incompatible)
        str1 = str2;
        //:: (assignment.type.incompatible)
        str2 = str1;
        
        obj1 = str1;
        obj2 = str2;
        
        //:: (assignment.type.incompatible)        
        obj1 = str2;
        //:: (assignment.type.incompatible)        
        obj2 = str1;
    }
}