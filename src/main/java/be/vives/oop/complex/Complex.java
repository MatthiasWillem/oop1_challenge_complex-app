package be.vives.oop.complex;

public class Complex {
        // Private
        private double real = 0;
        private double imaginary = 0;
    
        // Public
        public Complex(double real, double imaginary) {
            setReal(real);
            setImaginary(imaginary);
        }
    
        public void setReal(double real) {
            this.real = real;
        }
    
        public void setImaginary(double imaginary) {
            this.imaginary = imaginary;
        }
    
        public double getReal() {
            return real;
        }
    
        public double getImaginary() {
            return imaginary;
        }
    
        public Complex add(Complex second) {
            Complex result = new Complex();
            result.setReal(this.getReal() + second.getReal());
            result.setImaginary(this.getImaginary() + second.getImaginary());
            return result;
        }
    
        public Complex subtract(Complex third) {
            Complex result = new Complex();
            result.setReal(this.getReal() - third.getReal());
            result.setImaginary(this.getImaginary() - third.getImaginary());
            return result;
        }
    
        public Complex() {
            this(0, 0);
        }
    
        @Override
        public String toString() {
            if (getImaginary() < 0) {
                return "(" + getReal() + " - " + -getImaginary() + "j)";
            } else {
                return "(" + getReal() + " + " + getImaginary() + "j)";
            }
        }

        public Complex (Complex original) {
            this(original.getReal(), original.getImaginary());
            }


            public Complex multiplycomplex(Complex multi) {
                Complex result = new Complex();
                result.setReal(this.getReal() * multi.getReal() - this.getImaginary() * multi.getImaginary());
                result.setImaginary(this.getReal() * multi.getImaginary() + this.getImaginary() * multi.getReal());
                return result;
            }

            public Complex divide(double factor) {
                Complex result = new Complex();
                result.setReal(this.getReal() / factor);
                result.setImaginary(this.getImaginary() / factor);
                return result;
            }

            public Complex multiply(double factor) {
                Complex result = new Complex();
                result.setReal(this.getReal() * factor);
                result.setImaginary(this.getImaginary() * factor);
                return result;
            }

            public Complex dividecomplex(Complex div) {
                Complex result = new Complex();
                result.setReal((this.getReal() * div.getReal() + this.getImaginary() * div.getImaginary())/(div.getReal() * this.getReal() + this.getImaginary() * this.getImaginary()));
                result.setImaginary((this.getImaginary() * div.getReal() - this.getReal() * div.getImaginary()) / (div.getReal() * this.getReal() + this.getImaginary() * this.getImaginary()));
                return result;
            }
            

}