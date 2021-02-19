package calculadora;

public class Calculadora {

    public Calculadora() {
    }

    public int sumar(int a, int b){return a + b;}
    public int restar(int a, int b){return a - b;}
    public int multi(int a, int b)throws InterruptedException {
        Thread.sleep(500);
        return a * b;
    }
    public int div(int a, int b){
        if(b==0)
            throw new ArithmeticException("Division entre 0");
        return a/b;
    }
}
