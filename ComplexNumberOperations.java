class Complex{
    int real;
    int imag;
    
    Complex( int real, int imag){
        this.real =  real;
        this.imag =  imag;
    }
    Complex(){
        real = 0;
        imag = 0;
    }
    public Complex add(Complex c){
        Complex res =  new Complex();
        res.real = this.real + c.real;
        res.imag = this.imag + c.imag;
        return res;
    }
    public Complex sub(Complex c){
        return new Complex(this.real - c.real, this.imag -  c.imag);
    }
    public Complex mul(Complex c){
        return new Complex(real*c.real,imag*c.imag);
    }
    public Complex div(Complex c){
        return new Complex(this.real / c.real, this.imag / c.imag);
    }
    public Complex modulo(Complex c){
        return new Complex(this.real % c.real, this.imag % c.imag);
    }
    public void display(){
        System.out.println(real+"+i"+imag);
    }
    
}
public class Main
{
	public static void main(String[] args) {
        Complex c1 = new Complex(2,5);
        Complex c2 = new Complex(12,5);
        Complex c3 = new Complex();
        //Complex c4 = new Complex();
        c3= c1.add(c2);
        c3.display();
        c3 = c2.sub(c1);
        c3.display();
        c3= c2.mul(c1);
        c3.display();
        c3=c2.div(c1);
        c3.display();
        c3=c2.modulo(c1);
        c3.display();
	}
}
