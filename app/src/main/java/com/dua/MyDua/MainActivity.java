package com.dua.MyDua;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import androidx.navigation.ui.AppBarConfiguration;
import androidx.viewpager2.widget.ViewPager2;

import com.dua.MyDua.databinding.ActivityMainBinding;
import com.dua.MyDua.ui.main.aboutact;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    public Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent butt= new Intent(MainActivity.this, aboutact.class);
                startActivity(butt);
            }
        });

        TabLayout tabLayout = findViewById(R.id.tabs);
        ViewPager2 viewPager2 = findViewById(R.id.view_pager);

        ViewPagerAdapter adapter =new ViewPagerAdapter(this);
        viewPager2.setAdapter(adapter);
    }

    public void cevsen(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ortakhatim.com/cevsen/index.htm"));
        startActivity(browserIntent);
    }
    public void kuran(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.onlinedua.org/kuran"));
        startActivity(browserIntent);
    }
    public void kisakulubuddaria(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1lcP83MWVG1GQkWim8pdu4MVs90FUdyyu/view?usp=sharing"));
        startActivity(browserIntent);
    }
    public void  kulubuddaria(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ortakhatim.com/ekd/"));
        startActivity(browserIntent);
    }
    public void erisale(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://risaleinur.com/risale-i-nur-collection.html"));
        startActivity(browserIntent);
    }
    public void corona(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Ww1qlaFI8J2dsdh3FawLE6ehgWKinXXX/view?usp=sharing"));
        startActivity(browserIntent);
    }
    public void asrin(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://fgulen.com/tr/eserleri/asrin-getirdigi-tereddutler"));
        startActivity(browserIntent);
    }
    public void fetih(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://kuran.diyanet.gov.tr/mushaf/kuran-1/fetih-suresi-48/ayet-1/kuran-yolu-meali-5"));
        startActivity(browserIntent);
    }
    public void riyazussalihin(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1em47Gwxop87olotwf1IrKORTvIX-Mmla/view?usp=sharing"));
        startActivity(browserIntent);
    }
    public void meal(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ortakhatim.com/mukabele/MEAL/index.html"));
        startActivity(browserIntent);
    }
    public void tesbihat(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1npWCB9e_SVfKSnPXxTjZaMNaK10kvACX/view?usp=sharing"));
        startActivity(browserIntent);
    }
    public void elmali(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1URBGIUAVg1ph1iVUh39vpawz314hw7R2/view?usp=sharing"));
        startActivity(browserIntent);
    }
    public void yasin(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://kuran.diyanet.gov.tr/mushaf/kuran-1/yasin-suresi-36/ayet-1/kuran-yolu-meali-5"));
        startActivity(browserIntent);
    }
    public void nebe(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://kuran.diyanet.gov.tr/mushaf/kuran-1/nebe-suresi-78/ayet-1/kuran-yolu-meali-5"));
        startActivity(browserIntent);
    }
    public void mulk(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://kuran.diyanet.gov.tr/mushaf/kuran-1/mulk-suresi-67/ayet-1/kuran-yolu-meali-5"));
        startActivity(browserIntent);
    }
    public void kisasureler(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://kuran.diyanet.gov.tr/mushaf/kuran-1/duha-suresi-93/ayet-1/kuran-yolu-meali-5"));
        startActivity(browserIntent);
    }
    public void sekine(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1JsRskA_Yc_ziBHJRa-SBqEGm3ZClTGn1/view?usp=sharing"));
        startActivity(browserIntent);
    }
    public void tevhidname(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/17ZOvmBNCAiXgM8eH8JZ9d-FGBaz9NApr/view?usp=sharing"));
        startActivity(browserIntent);
    }
    public void ilmihal(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1t9tN4fWEb5i0HSrLBqXuBhP2WV7LbWkM/view?usp=sharing"));
        startActivity(browserIntent);
    }
    public void bcevsen(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ortakhatim.com/cevsen/"));
        startActivity(browserIntent);
    }
    public void pirlanta(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://sureyyakitap.com/sesli-kitaplar/"));
        startActivity(browserIntent);
    }
    public void ortakdua(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.herkul.org/ortak-dua/"));
        startActivity(browserIntent);
    }
    public void kozet(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ozgurherkul.org/category/kitap-ozetleri/"));
        startActivity(browserIntent);
    }

    public void risale(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://risaleoku.com/"));
        startActivity(browserIntent);
    }

    public void celcelutiye(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.onlinedua.org/celcelutiye"));
        startActivity(browserIntent);
    }

    public void ekudsiye(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.onlinedua.org/evradi-kudsiyye"));
        startActivity(browserIntent);
    }
    public void rahman(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.onlinedua.org/buyuk-cevsen/32"));
        startActivity(browserIntent);
    }
    public void hasir(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.onlinedua.org/buyuk-cevsen/40"));
        startActivity(browserIntent);
    }
}