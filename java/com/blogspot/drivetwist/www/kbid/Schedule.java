package com.blogspot.drivetwist.www.kbid;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Schedule extends Activity {
    private Button DatePickerButton;
    private DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        final String[] Matches={
                "Telugu Titans vs Tamil Thalaivas", "U Mumba vs Puneri Paltan",
                "Jaipur Pink Panthers vs Dabadng Delhi",
                "Telugu Titans vs Patna Pirates",
                "U Mumba vs Haryana Steelers",
                "Telugu Titans vs Bengaluru Bulls",
                "Gujarat Fortunegiants vs Dabang Delhi",
                "Telugu Titans vs UP Yoddha",
                "Gujarat Fortunegiants vs Haryana Steelers",
                "Telugu Titans vs Bengal Warriors",
                "Telugu Titans vs Patna Pirates",
                "Bengaluru Bulls vs Tamil Thalaivas",
                "Puneri Paltan vs Dabang Delhi",
                "U Mumba vs Dabang Delhi",
                "Bengaluru Bulls vs UP Yoddha",
                "Bengal Warriors vs UP Yoddha",
                "Bengaluru Bulls vs Patna Pirates",
                "Gujarat Fortunegiants vs Haryana Steelers",
                "Bengaluru Bulls vs Telugu Titans",
                "Bengaluru Bulls vs Bengal Warriors",
                "Puneri Paltan vs Jaipur Pink Panthers",
                "Bengaluru Bulls vs Tamil Thalaivas",
                "Gujarat Fortunegiants vs U Mumba",
                "Telugu Titans vs UP Yoddha",
                "Gujarat Fortunegiants vs Dabang Delhi",
                "Patna Pirates vs Up Yodha",
                "Gujarat Fortunegiants vs Jaipur Pink Panthers",
                "Bengal Warriors vs Puneri Paltan",
                "Gujarat Fortunegiants vs Bengaluru Bulls",
                "Haryana Steelers vs Tamil Thalaivas",
                "Gujarat Fortunegiants vs Telugu Titans",
                "Dabang Delhi vs Tamil Thalaivas",
                "Gujarat Fortunegiants vs Bengal Warriors",
                "UP Yodha vs U Mumba",
                "Bengaluru Bulls vs Jaipur Pink Panthers",
                "Telugu Titans vs U Mumba",
                "UP Yodha vs Haryana Steelers",
                "Patna Pirates vs Puneri Paltan",
                "UP Yodha vs Jaipur Pink Panthers",
                "Gujarat Fortunegiants vs Puneri Paltan",
                "UP Yodha vs Jaipur Pink Panthers",
                "Haryana Steelers vs Dabang Delhi",
                "UP Yodha vs Tamil Thalaivas",
                "UP Yodha vs Telugu Titans",
                "U Mumba vs Jaipur Pink Panthers",
                "Bengal Warriors vs Patna pirates",
                "Patna Pirates vs Tamil Thalaivas",
                "U Mumba vs Puneri Pultan",
                "Bengal Warriors vs Bengaluru Bulls",
                "U Mumba vs Dabang Delhi",
                "Bengaluru Bulls vs UP Yodha",
                "U Mumba vs Gujarat Fortunegiants",
                "U Mumba vs Haryana Steelers",
                "Telugu Titans vs Tamil Thalaivas",
                "U Mumba vs Jaipur Pink Panthers",
                "Bengal Warriors vs Patna Pirates",
                "Gujarat Fortunegiants vs Jaipur Pink Panthers",
                "Bengal Warriors vs UP Yodha",
                "Gujarat Fortungiants vs Jaipur Pink Panthers",
                "Bengal Warriors vs Tamil Thalaivas",
                "Patna Pirates vs Jaipur Pink Panthers",
                "Bengal Warriors vs Haryana Steelers",
                "Dabang Delhi vs Bengaluru Bulls",
                "Bengal Warriors vs U Mumba",
                "Telugu Titans, vs Puneri Paltan",
                "Bengal Warriors vs Dabang Delhi",
                "Haryana Steelers vs Patna Pirates",
                "Gujarat Fortunegiants vs UP Yodha",
                "Patna Pirates vs U Mumba",
                "Haryana Steelers vs Bengaluru Bulls",
                "Bengaluru Bulls, Puneri Paltan",
                "Haryana Steelers vs Telugu Titans",
                "Bengal Warriors vs Telugu Titans",
                "Haryana Steelrs vs Dabang Delhi",
                "Tamil Thalaivas vs UP Yodha",
                "Haryana Steelers vs Puneri Paltan",
                "Haryana Steelers vs Jaipur Pink Panthers",
                "Patna Pirates vs Telugu Titans",
                "U Mumba vs Gujarat Fortunegiants",
                "Bengaluru Bulls vs Telugu Titans",
                "Patna Pirates vs UP Yodha",
                "Jaipur Pink Panthers vs Dabang Delhi",
                "Patna Pirates vs Bengal Warriors",
                "Puneri Paltan vs Haryana Steelers",
                "Patna Pirates vs Bengaluru Bulls",
                "Patna Pirates vs Tamil Thalaivas",
                "Jaipur Pink Panthers vs Haryana Steelers",
                "Patna Pirates vs UP Yodha",
                "Dabang Delhi vs U Mumba",
                "Bengaluru vs Bengal Warriors",
                "Dabang Delhi vs Pune Pirates",
                "Bengal Warriors vs Tamil Thalaivas",
                "Dabang Delhi vs Haryana Steelers",
                "Gujarat Fortunegiants vs Tamil Thalaivas",
                "Dabang Delhi, Patna Pirates",
                "Telugu Titans vs Jaipur Pink Panthers",
                "Dabang Delhi vs UP Yodha",
                "Bengaluru Bulls vs U Mumba",
                "Dabang Delhi vs Telugu Titans",
                "Tamil Thalaivas vs Pune Pirates",
                "Gujarat Fortunegiants bs Patna pirates",
                "Pune Pirates vs UP Yodha",
                "Tamil Thalaivas vs Jaipur Pink Panthers",
                "Jaipur vs Bengal Warriors",
                "Tamil Thalaivas vs U Mumba",
                "Dabang Delhi vs Gujarat Fortunegiants",
                "Tamil Thalaivas vs Telugu Titans",
                "U Mumba vs Haryana Steelers",
                "Tamil Thalaivas vs UP Yodha",
                "Tamil Thalaivas vs Bengaluru Bulls",
                "Jaipur Pink Panthers vs Gujarat Fortunegiants",
                "TBD vs TBD",
                "TBD vs TBD",
                "Jaipur Pink Panthers vs U Mumba",
                "TBD vs TBD",
                "Jaipur Pink Panthers vs Puneri Paltan",
                "TBD vs TBD",
                "Jaipur Pink Panthers vs Dabang Delhi",
                "TBD vs TBD",
                "Jaipur Pink Panthers vs Haryana Steelers",
                "TBD vs TBD",
                "Puneri Pultan vs Gujarat Fortunegiants",
                "Bengal Warriors vs Tamil Thalaivas",
                "Tamil Thalaivas vs Patna Pirates",
                "Puneri Paltan vs U Mumba",
                "Bengaluru Bulls vs UP Yodha",
                "Puneri Paltan vs Dabang Delhi",
                "Puneri Paltan vs Haryana Steelers",
                "Patna Pirates vs Bengaluru Bulls",
                "Puneri Paltan vs Jaipur Pink Panthers",
                "Telugu Titans vs Bengal Warriors",
                "Puneri Paltan vs Gujarat Fortunegiants",
                "Qualifier 1",
                "Qualifier 2",
                "Qualifier 3",
                "Eliminator 1",
                "Eliminator 2",
                "Final"

        };



        // ArrayAdapter<String> adapter=new CustomAdapter(this,color);

        //ListView list=(ListView)findViewById(R.id.List_View);
        //list.setAdapter(adapter);
        final String[] Dates={"28/7/2017"," 28/7/2017","29/7/2017","29/7/2017","30/7/2017","30/7/2017","1/8/2017","1/8/2017",
                "2/8/2017","2/8/2017","3/8/2017","4/8/2017","4/8/2017","5/8/2017","5/8/2017",
                "6/8/2017","6/8/2017","8/8/2017","8/8/2017","9/8/2017","10/8/2017","10/8/2017",
                "11/8/2017","12/8/2017","12/8/2017","13/8/2017","13/8/2017","15/8/2017","15/8/2017",
                "16/8/2017","16/8/2017","17/8/2017","17/8/2017","18/8/2017","18/8/2017","19/8/2017","19/8/2017",
                "20/8/2017","20/8/2017","22/8/2017","22/8/2017","23/8/2017","23/8/2017","24/8/2017","25/8/2017","25/8/2017",
                "26/8/2017","26/8/2017","27/8/2017","27/8/2017","29/8/2017","29/8/2017","30/8/2017","31/8/2017","31/8/2017",
                "1/9/2017","2/9/2017","2/9/2017","3/9/2017","3/9/2017","5/9/2017","5/9/2017 ","6/9/2017",
                "6/9/2017","7/9/2017","7/9/2017","8/9/2017","8/9/2017","9/9/2017","9/9/2017 ","10/9/2017",
                "10/9/2017","12/9/2017","12/9/2017","13/9/2017","13/9/2017","14/9/2017","15/9/2017","16/9/2017","16/9/2017",
                "17/9/2017","17/9/2017","17/9/2017","19/9/2017","19/9/2017","20/9/2017","21/9/2017","21/9/2017",
                "22/9/2017","23/9/2017","23/9/2017","24/9/2017","24/9/2017","26/9/2017","26/9/2017","27/9/2017","27/9/2017",
                "28/9/2017","28/9/2017","29/9/2017","29/9/2017","30/9/2017","30/9/2017","1/10/2017","1/10/2017","3/10/2017","3/10/2017 ",
                "4/10/2017","4/10/2017","5/10/2017","6/10/2017","6/10/2017","7/10/2017","7/10/2017","8/10/2017","8/10/2017",
                "10/10/2017","10/10/2017","11/10/2017","11/10/2017","12/10/2017","13/10/2017","13/10/2017","14/10/2017","14/10/2017",
                "15/10/2017","15/10/2017","17/10/2017","18/10/2017","18/10/2017","20/10/2017","20/10/2017","22/10/2017","22/10/2017","23/10/2017",
                "23/10/2017","26/10/2017","28/10/2017"
        };
        final String[] places={"Hyderabad","Hyderabad","Hyderabad","Hyderabad","Hyderabad","Hyderabad","Hyderabad","Hyderabad","Hyderabad","Hyderabad","Hyderabad","Hyderabad","Bengaluru",
                "Bengaluru","Bengaluru","Bengaluru","Bengaluru","Bengaluru","Bengaluru","Bengaluru","Bengaluru","Bengaluru","Bengaluru","Bengaluru","Ahmedabad","Ahmedabad","Ahmedabad","Ahmedabad","Ahmedabad","Ahmedabad","Ahmedabad","Ahmedabad",
                "Lucknow","Lucknow","Lucknow","Lucknow","Lucknow","Lucknow","Lucknow","Lucknow","Lucknow","Lucknow","Lucknow","Mumbai","Mumbai","Mumbai","Mumbai","Mumbai","Mumbai","Mumbai","Mumbai","Mumbai","Mumbai","Mumbai",
                "Kolkata","Kolkata","Kolkata","Kolkata","Kolkata","Kolkata","Kolkata","Kolkata","Kolkata","Kolkata","Kolkata","Haryana","Haryana","Haryana","Haryana","Haryana",
                "Haryana","Haryana","Haryana","Haryana","Haryana","Haryana","Ranchi","Ranchi","Ranchi","Ranchi","Ranchi","Ranchi","Ranchi","Ranchi","Ranchi","Ranchi","Ranchi"," Delhi",
                " Delhi"," Delhi"," Delhi"," Delhi"," Delhi"," Delhi"," Delhi"," Delhi"," Delhi"," Delhi","Chennai","Chennai","Chennai","Chennai","Chennai","Chennai","Chennai","Chennai",
                "Chennai","Chennai","Chennai","Jaipur","Jaipur","Jaipur","Jaipur","Jaipur","Jaipur","Jaipur","Jaipur","Jaipur","Jaipur","Jaipur","Pune","Pune","Pune","Pune","Pune","Pune","Pune",
                "Pune","Pune","Pune","Pune"," Mumbai"," Mumbai"," Mumbai"," Mumbai"," Mumbai","Chennai","Chennai"
        };


        DatePickerButton =(Button) findViewById(R.id.DatePickerButton);
        DatePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Date = getDate();
                List<String> DatesArray=Arrays.asList(Dates);
                ArrayList<String> Match=new ArrayList<String>();
                if(DatesArray.contains(Date)){
                    for(int i=0;i<Dates.length;i++){
                        if(Date.equals(Dates[i])){
                            Match.add(Matches[i]+" in "+places[i]);
                        }

                    }
                    gotoclass(Match);
                }
                else{
                    Toast.makeText(Schedule.this, "There are no events on this day", Toast.LENGTH_SHORT).show();
                }


            }
        });
        Button BookTicket=(Button)findViewById(R.id.BookTickets);
        BookTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://in.bookmyshow.com/sports/pro-kabaddi"));
                startActivity(intent);
            }
        });
    }
    String getDate(){
        datePicker=(DatePicker)findViewById(R.id.datePicker);
        int day=datePicker.getDayOfMonth();
        int month=datePicker.getMonth()+1;
        int year=datePicker.getYear();
        String Date=day+"/"+month+"/"+year;
        return Date;
    }
    void gotoclass(ArrayList<String> places){
        Intent i=new Intent(this,Main2Activity.class);
        i.putExtra("PlacesDetails",places);
        startActivity(i);
    }
}

