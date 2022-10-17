package com.example.vkalculator2o;


//Bracket not perfect with functions
//square,fact,root,etc. not working in between equation
//crashing on wrong input
//large values getting out of screen

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bpi,beql,badd,bmin,bmul,bdiv,bsqr,bfact,br1,br2,bac,bc,bsin,bcos,btan,blog,bln,bsqrt,bres;
    TextView tvprim,tvsec;
    String pi="3.14";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b0=findViewById(R.id.b0);
        bpi=findViewById(R.id.bpi);
        beql=findViewById(R.id.beql);
        bdot=findViewById(R.id.bdot);
        bmin=findViewById(R.id.bmin);
        badd=findViewById(R.id.badd);
        bmul=findViewById(R.id.bmul);
        bdiv=findViewById(R.id.bdiv);
        bln=findViewById(R.id.bln);
        blog=findViewById(R.id.blog);
        bsin=findViewById(R.id.bsin);
        bcos=findViewById(R.id.bcos);
        btan=findViewById(R.id.btan);
        bsqr=findViewById(R.id.bsqr);
        bsqrt =findViewById(R.id.bsqrt);
        bfact=findViewById(R.id.bfact);
        bres=findViewById(R.id.bres);
        bac=findViewById(R.id.bac);
        bc=findViewById(R.id.bc);
        br1=findViewById(R.id.br1);
        br2=findViewById(R.id.br2);

        tvprim=findViewById(R.id.tvprim);
        tvsec=findViewById(R.id.tvsec);

        //onclick listen
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+".");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText("");
                tvsec.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=tvprim.getText().toString();
                val=val.substring(0,val.length()-1);
                tvprim.setText(val);
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"+");
            }
        });
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"-");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"×");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"÷");
            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val= tvprim.getText().toString();
                double r=Math.sqrt(Double.parseDouble(val));
                tvprim.setText(String.valueOf(r));
            }
        });
        br1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"(");
            }
        });
        br2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+")");
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsec.setText(bpi.getText());
                tvprim.setText(tvprim.getText()+pi);
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"sin");
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"cos");
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"tan");
            }
        });
        bres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsec.setText(bres.getText());
                tvprim.setText(tvprim.getText()+"^"+"(-1)");
            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(tvprim.getText().toString());
                int fact= factorial(val);
                tvprim.setText(String.valueOf(fact));
                tvsec.setText(val+"!");
            }
        });
        bsqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d= Double.parseDouble(tvprim.getText().toString());
                double sqar= d*d;
                tvprim.setText(String.valueOf(sqar));
                tvsec.setText(d+"²");
            }
        });
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"ln");
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvprim.setText(tvprim.getText()+"log");
            }
        });
        beql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val =tvprim.getText().toString();
                String replacestr=val.replace('÷','/').replace('×','*');
                double result = eval(replacestr);
                tvprim.setText(String.valueOf(result));
                tvsec.setText(val);
            }
        });



    }
    //Factorial Function
    int factorial(int n)
    {
        // return (n==1 ||n==0)?1:n*factorial(n-1);
        if (n==0 || n==1){
            return 1;
        }

        else{
            return n*factorial(n-1);
        }
    }

    int vikram(int n)
    {
        // return (n==1 ||n==0)?1:n*factorial(n-1);
        if (n==0 || n==1){
            return 1;
        }

        else{
            return n*vikram(n-1);
        }
    }

    int factorialnew(int n)
    {
        return (n==1 ||n==0)?1:n*factorial(n-1);
    }

    int sum(int n)
    {
        return n*(n+1)/2;
    }

    int sumOfOdd(int n)
    {
        return n*n;
    }

    int sumOfEven(int n) 
    {
        return n*(n+1);
    }

    //eval function
    public static double eval(final String str){
        return new Object(){
            int pos = -1,ch;

            void nextChar(){
                ch=(++pos <str.length())? str.charAt(pos): -1;
            }
            boolean eat(int charToEat){
                while(ch==' ') nextChar();
                if(ch==charToEat){
                    nextChar();
                    return true;
                }
                return false;
            }
            double parse(){
                nextChar();
                double x=parseExpression();
                if(pos<str.length()) throw new RuntimeException("Unexpected: "+(char)ch);
                return x;
            }
            double parseExpression(){
                double x=parseTerm();
                for(;;){
                    if(eat('+')) x+=parseTerm();
                    else if(eat('-'))x-=parseTerm();
                    else return x;
                }
            }
            double parseTerm() {
                double x = parseFactor();
                for(;;){
                    if(eat('*')) x*=parseFactor();
                    else if(eat('/')) x/=parseFactor();
                    else return x;
                }
            }
            double parseFactor(){
                if(eat('+'))return parseFactor();
                if(eat('-'))return -parseFactor();
                double x;
                int startPos = this.pos;
                if(eat('(')){
                    x=parseExpression();
                    eat(')');
                }
                else if((ch>='0' && ch<='9') || ch=='.'){
                    while((ch>='0' && ch<='9')||ch=='.')nextChar();
                    x = Double.parseDouble(str.substring(startPos,this.pos));
                }
                else if(ch>='a' && ch<='z'){
                    while(ch>='a' && ch<='z')nextChar();
                    String func = str.substring(startPos,this.pos);
                    x=parseFactor();
                    if(func.equals("sqrt")) x=Math.sqrt(x);
                    else if(func.equals("sin")) x=Math.sin(Math.toRadians(x));
                    else if(func.equals("cos")) x=Math.cos(Math.toRadians(x));
                    else if(func.equals("tan")) x=Math.tan(Math.toRadians(x));
                    else if(func.equals("log")) x=Math.log10(x);
                    else if(func.equals("ln")) x=Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                }
                else{
                    throw new RuntimeException("Unexpected: "+ (char)ch);
                }
                if(eat('^')) x=Math.pow(x,parseFactor());

                return x;
            }

        }.parse();
    }
}