package com.blogspot.drivetwist.www.kbid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.Toast;

public class FoodOrder extends AppCompatActivity {
    Button dB;
    Button iB;
    Button dS;
    Button iS;
    Button dP;
    Button iP;
    Button dF;
    Button iF;
    Button dD;
    Button iD;
    Button dH;
    Button iH;
    TextView B,S,P,F,D,H;
    Button ok;
    TextView bill;
    String bu="",sa="",pi="",fr="",ho="",dr="";
    int b=0,s=0,p=0,f=0,d=0,h=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_order);
        dB=(Button)findViewById(R.id.dBurger);
        iB=(Button)findViewById(R.id.iBurger);
        dS=(Button)findViewById(R.id.dSandwich);
        iS=(Button)findViewById(R.id.iSandwich);
        iP=(Button)findViewById(R.id.iPizza);
        dP=(Button)findViewById(R.id.dPizza);
        dF=(Button)findViewById(R.id.dFrenchfrie);
        iF=(Button)findViewById(R.id.iFrenchfrie);
        dD=(Button)findViewById(R.id.dDrink);
        iD=(Button)findViewById(R.id.iDrink);
        dH=(Button)findViewById(R.id.dHotdog);
        iH=(Button)findViewById(R.id.iHotdog);
        B=(TextView)findViewById(R.id.burger);
        S=(TextView)findViewById(R.id.burger2);
        P=(TextView)findViewById(R.id.burger3);
        F=(TextView)findViewById(R.id.burger4);
        D=(TextView)findViewById(R.id.burger5);
        H=(TextView)findViewById(R.id.burger6);
        ok=(Button)findViewById(R.id.Submit);
        bill=(TextView)findViewById(R.id.textView7);
    }

    public void donClickB(View view){
        if(b>=1){
            b=b-1;
            bu=Integer.toString(b);
            B.setText(bu);}
    }
    public void ionClickB(View view){
        if(b>=0){
            b=b+1;
            bu=Integer.toString(b);
            B.setText(bu);}
    }
    public void donClickS(View view){
        if(s>=1){
            s=s-1;
            sa=Integer.toString(s);
            S.setText(sa);}
    }
    public void ionClickS(View view){
        if(s>=0){
            s=s+1;
            sa=Integer.toString(s);
            S.setText(sa);}
    }
    public void donClickP(View view){
        if(p>=1){
            p=p-1;
            pi=Integer.toString(p);
            P.setText(pi);}
    }
    public void ionClickP(View view){
        if(p>=0){
            p=p+1;
            pi=Integer.toString(p);
            P.setText(pi);}
    }

    public void donClickF(View view){
        if(f>=1){
            f=f-1;
            fr=Integer.toString(f);
            F.setText(fr);}
    }

    public void ionClickF(View view){
        if(f>=0) {
            f = f + 1;
            fr = Integer.toString(f);
            F.setText(fr);
        }   }

    public void donClickD(View view){
        if(d>=1){
            d=d-1;
            dr=Integer.toString(d);
            D.setText(dr);
        }}

    public void ionClickD(View view){
        if(d>=0) {
            d = d + 1;
            dr = Integer.toString(d);
            D.setText(dr);
        }
    }
    public void donClickH(View view){
        if(h>=1){
            h=h-1;
            ho=Integer.toString(h);
            H.setText(ho);
        }}
    public void ionClickH(View view){
        if(h>=0){
            h=h+1;
            ho=Integer.toString(h);
            H.setText(ho);}
    }

    public void Submit(View view){
        int result;
        result=((b*10)+(s*20)+(p*30)+(f*40)+(d*50)+(h*60));
        String res=Integer.toString(result);
        bill.setText(res);
    }
}


