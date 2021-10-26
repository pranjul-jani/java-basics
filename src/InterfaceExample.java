interface interf {

    public void m1();
    public void m2();

}

public abstract class InterfaceExample implements interf {


    @Override
    public void m1() {

    }
}

class SubInterafaceExample extends InterfaceExample {
    @Override
    public void m2() {

    }

}
