package com.example.mybank

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mybank.ui.theme.MyBankTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            navber
           Row(
               modifier = Modifier.padding(16.dp),
               horizontalArrangement = Arrangement.SpaceBetween,
               verticalAlignment = Alignment.CenterVertically
           ) {
               Row() {
                   Text("Hello ", style = TextStyle(fontSize = 28.sp, fontFamily = FontFamily.SansSerif))
                   Text("Nick", style = TextStyle(fontSize = 28.sp, fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold))

               }
               Spacer(modifier = Modifier.width(70.dp))
               Row() {
                   ImageCircle(painter = painterResource(id = R.drawable.bell_icon), des = "bell icon" )
                   Spacer(modifier = Modifier.width(15.dp))
                   ImageCircle(painter = painterResource(id = R.drawable.abhishek), des = "abhishek" )

               }





           }
//            card


        }
    }
}

@Composable
fun CardSection (
    amount : String
){

}


@Composable
fun ImageCircle(
    painter : Painter,
    des : String
){
   Card (
       modifier = Modifier
           .height(50.dp)
           .width(50.dp),
       shape = RoundedCornerShape(25.dp),
       border = BorderStroke(0.5.dp, Color.White),
       elevation = 10.dp
           ){
       Image(painter = painter, contentDescription = des)
   }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Row(
        modifier = Modifier.padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row() {
            Text("Hello ", style = TextStyle(fontSize = 28.sp, fontFamily = FontFamily.SansSerif))
            Text("Nick", style = TextStyle(fontSize = 28.sp, fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold))

        }
        Spacer(modifier = Modifier.width(70.dp))
        Row() {
            ImageCircle(painter = painterResource(id = R.drawable.bell_icon), des = "bell icon" )
            Spacer(modifier = Modifier.width(15.dp))
            ImageCircle(painter = painterResource(id = R.drawable.abhishek), des = "abhishek" )

        }





    }
//            card

}