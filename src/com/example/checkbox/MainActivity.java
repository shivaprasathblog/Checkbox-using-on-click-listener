package com.example.checkbox;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity
{
	//Define Checkbox as c1,c2,c3 respectively
	CheckBox c1,c2,c3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		//Refer the checkbox with their respective id's from XML
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		c1=(CheckBox)findViewById(R.id.checkBox1);
		c2=(CheckBox)findViewById(R.id.checkBox2);
		c3=(CheckBox)findViewById(R.id.checkBox3);

	//Set the listener for Checkbox, we use onclik listener here 
	c1.setOnClickListener(new OnClickListener() 
	{
		
		@Override
		public void onClick(View arg0) 
		{
			// TODO Auto-generated method stub
			if(c1.isChecked()==true)
			{
				//Toast message if c1 is checked(clicked)
				Toast.makeText(MainActivity.this,"Salary Account is Selected",Toast.LENGTH_LONG).show();
			}
			else if(c1.isChecked()==false)
			{
				//Toast message if c1 is unchecked
				Toast.makeText(MainActivity.this,"Salary Account is UnSelected",Toast.LENGTH_LONG).show();
			}
			
		}
	});
	
	
	c2.setOnClickListener(new OnClickListener() 
	{
			
			@Override
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub
				if(c2.isChecked()==true)
				{
					//Toast message if c2 is checked(clicked)					
					Toast.makeText(MainActivity.this,"Savings Account is Selected",Toast.LENGTH_LONG).show();
				}
				else if(c2.isChecked()==false)
				{
					//Toast message if c2 is unchecked
					Toast.makeText(MainActivity.this,"Savings Account is UnSelected",Toast.LENGTH_LONG).show();
				}
			}
		});
	
	
	c3.setOnClickListener(new OnClickListener() 
	{
		
		@Override
		public void onClick(View arg0) 
		{
			// TODO Auto-generated method stub
			if(c3.isChecked()==true)
			{
				//Toast message if c3 is checked(clicked)	
				Toast.makeText(MainActivity.this,"Current Account is Selected",Toast.LENGTH_LONG).show();
			}
			else if(c3.isChecked()==false)
			{
				//Toast message if c3 is unchecked
				Toast.makeText(MainActivity.this,"Current Account is UnSelected",Toast.LENGTH_LONG).show();
			}
			
		}
	});
	}
	

}
