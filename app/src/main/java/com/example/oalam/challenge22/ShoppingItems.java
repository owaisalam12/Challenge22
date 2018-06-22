package com.example.oalam.challenge22;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShoppingItems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_items);


    }

    public void buttonShoppingItems(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        Button b=(Button)view;
        switch (view.getId()){
            case R.id.button1:
                intent.putExtra("Shopping",((Button) view).getText().toString());
                break;
            case R.id.button2:
                intent.putExtra("Shopping",((Button) view).getText().toString());
                break;
            case R.id.button3:
                intent.putExtra("Shopping",((Button) view).getText().toString());
                break;
            case R.id.button4:
                intent.putExtra("Shopping",((Button) view).getText().toString());
                break;
            case R.id.button5:
                intent.putExtra("Shopping",((Button) view).getText().toString());
                break;
            case R.id.button6:
                intent.putExtra("Shopping",((Button) view).getText().toString());
                break;
            case R.id.button7:
                intent.putExtra("Shopping",((Button) view).getText().toString());
                break;
            case R.id.button8:
                intent.putExtra("Shopping",((Button) view).getText().toString());
                break;
            case R.id.button9:
                intent.putExtra("Shopping",((Button) view).getText().toString());
                break;
            case R.id.button10:
                intent.putExtra("Shopping",((Button) view).getText().toString());
                break;

        }
        setResult(RESULT_OK,intent);
        //startActivity(intent);
        finish();
    }
}
