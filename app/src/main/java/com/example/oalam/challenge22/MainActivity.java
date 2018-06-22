package com.example.oalam.challenge22;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count=0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonItem=(Button)findViewById(R.id.button_addItem);
        buttonItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                Intent intent=new Intent(getApplicationContext(),ShoppingItems.class);
                startActivityForResult(intent,1);
            }
        });
//// Restore the saved state. See onSaveInstanceState() for what gets saved.
//        if (savedInstanceState != null) {
//            // Show both the header and the message views. If isVisible is
//            // false or missing from the bundle, use the default layout.
//                textView.setText(savedInstanceState.getString("reply_text"));
//        }
    } @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String item=data.getStringExtra("Shopping");
//                Toast.makeText(this, "item"+item, Toast.LENGTH_SHORT).show();
                if(count==1){
                    textView =(TextView)findViewById(R.id.list_item1);
                    textView.setText(item);
                }
                else if(count==2){
                    textView =(TextView)findViewById(R.id.list_item2);
                    textView.setText(item);
                }else if(count==3){
                    textView =(TextView)findViewById(R.id.list_item3);
                    textView.setText(item);
                }else if(count==4){
                    textView =(TextView)findViewById(R.id.list_item4);
                    textView.setText(item);
                }else if(count==5){
                    textView =(TextView)findViewById(R.id.list_item5);
                    textView.setText(item);
                }else if(count==6){
                    textView =(TextView)findViewById(R.id.list_item6);
                    textView.setText(item);
                }else if(count==7){
                    textView =(TextView)findViewById(R.id.list_item7);
                    textView.setText(item);
                }else if(count==8){
                    textView =(TextView)findViewById(R.id.list_item8);
                    textView.setText(item);
                }else if(count==9){
                    textView =(TextView)findViewById(R.id.list_item9);
                    textView.setText(item);
                }else if(count==10){
                    textView =(TextView)findViewById(R.id.list_item10);
                    textView.setText(item);
                }
                else{
                    Toast.makeText(this, "No more!", Toast.LENGTH_SHORT).show();
                }
            }
        }
}
//    @Override
//    public void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//
//        // If the heading is visible, we have a message that needs to be saved.
//        // Otherwise we're still using default layout.
//
//
//            outState.putString("reply_text", textView.getText().toString());
//
//    }
}
