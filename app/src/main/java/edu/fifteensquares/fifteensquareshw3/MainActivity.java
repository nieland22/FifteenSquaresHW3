package edu.fifteensquares.fifteensquareshw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;

import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;

/**
@author Sierra Nieland
Date: 10 Nov. 2019
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //create a 2D array of buttons
    public Button gameGrid[][] = new Button[4][4];
    public int blankI;
    public int blankJ;
    public ArrayList<String> randNums = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setGameGrid();
        randomize();
        setColor();
    }

    //set buttons to the grid array
    public void setGameGrid(){
        gameGrid[0][0] = findViewById(R.id.button1);
        gameGrid[0][0].setOnClickListener(this);
        gameGrid[0][1] = findViewById(R.id.button2);
        gameGrid[0][1].setOnClickListener(this);
        gameGrid[0][2] = findViewById(R.id.button3);
        gameGrid[0][2].setOnClickListener(this);
        gameGrid[0][3] = findViewById(R.id.button4);
        gameGrid[0][3].setOnClickListener(this);
        gameGrid[1][0] = findViewById(R.id.button5);
        gameGrid[1][0].setOnClickListener(this);
        gameGrid[1][1] = findViewById(R.id.button6);
        gameGrid[1][1].setOnClickListener(this);
        gameGrid[1][2] = findViewById(R.id.button7);
        gameGrid[1][2].setOnClickListener(this);
        gameGrid[1][3] = findViewById(R.id.button8);
        gameGrid[1][3].setOnClickListener(this);
        gameGrid[2][0] = findViewById(R.id.button9);
        gameGrid[2][0].setOnClickListener(this);
        gameGrid[2][1] = findViewById(R.id.button10);
        gameGrid[2][1].setOnClickListener(this);
        gameGrid[2][2] = findViewById(R.id.button11);
        gameGrid[2][2].setOnClickListener(this);
        gameGrid[2][3] = findViewById(R.id.button12);
        gameGrid[2][3].setOnClickListener(this);
        gameGrid[3][0] = findViewById(R.id.button13);
        gameGrid[3][0].setOnClickListener(this);
        gameGrid[3][1] = findViewById(R.id.button14);
        gameGrid[3][1].setOnClickListener(this);
        gameGrid[3][2] = findViewById(R.id.button15);
        gameGrid[3][2].setOnClickListener(this);
        gameGrid[3][3] = findViewById(R.id.button16);
        gameGrid[3][3].setOnClickListener(this);

    }

    //create random method
    public void randomize(){
        Button reset = findViewById(R.id.resetButton);
        reset.setOnClickListener(this);

        //clear array list before adding so it clears every time it randomizes
        randNums.clear();

        //add numbers 1-16 to array list
        randNums.add("1");
        randNums.add("2");
        randNums.add("3");
        randNums.add("4");
        randNums.add("5");
        randNums.add("6");
        randNums.add("7");
        randNums.add("8");
        randNums.add("9");
        randNums.add("10");
        randNums.add("11");
        randNums.add("12");
        randNums.add("13");
        randNums.add("14");
        randNums.add("15");
        randNums.add("16");

        //randomize the array list of numbers 1-16
        Collections.shuffle(randNums);

        //create an index variable
        int index = 0;

        //randomize array
        for(int i=0; i<gameGrid.length; i++){
            for(int j=0; j<gameGrid.length; j++){
                gameGrid[i][j].setText(randNums.get(index));
                //make 16 blank
                if(randNums.get(index)=="16"){
                    blankI = i;
                    blankJ = j;
                    gameGrid[i][j].setText(" ");
                }
                index++;
            }
        }
    }

    //create method that indicates correct location by changing text color
    public void setColor(){
        if(gameGrid[0][0].getText()=="1"){
            gameGrid[0][0].setBackgroundColor(GREEN);
        }
        else{
            gameGrid[0][0].setBackgroundColor(RED);
        }

        if(gameGrid[0][1].getText()=="2"){
            gameGrid[0][1].setBackgroundColor(GREEN);
        }
        else{
            gameGrid[0][1].setBackgroundColor(RED);
        }

        if(gameGrid[0][2].getText()=="3"){
            gameGrid[0][2].setBackgroundColor(GREEN);
        }
        else{
            gameGrid[0][2].setBackgroundColor(RED);
        }

        if(gameGrid[0][3].getText()=="4"){
            gameGrid[0][3].setBackgroundColor(GREEN);
        }
        else{
            gameGrid[0][3].setBackgroundColor(RED);
        }

        if(gameGrid[1][0].getText()=="5"){
            gameGrid[1][0].setBackgroundColor(GREEN);
        }
        else{
            gameGrid[1][0].setBackgroundColor(RED);
        }

        if(gameGrid[1][1].getText()=="6"){
            gameGrid[1][1].setBackgroundColor(GREEN);
        }
        else{
            gameGrid[1][1].setBackgroundColor(RED);
        }

        if(gameGrid[1][2].getText()=="7"){
            gameGrid[1][2].setBackgroundColor(GREEN);
        }
        else{
            gameGrid[1][2].setBackgroundColor(RED);
        }

        if(gameGrid[1][3].getText()=="8"){
            gameGrid[1][3].setBackgroundColor(GREEN);
        }
        else{
            gameGrid[1][3].setBackgroundColor(RED);
        }

        if(gameGrid[2][0].getText()=="9"){
            gameGrid[2][0].setBackgroundColor(GREEN);
        }
        else{
            gameGrid[2][0].setBackgroundColor(RED);
        }

        if(gameGrid[2][1].getText()=="10"){
            gameGrid[2][1].setBackgroundColor(GREEN);
        }
        else{
            gameGrid[2][1].setBackgroundColor(RED);
        }

        if(gameGrid[2][2].getText()=="11"){
            gameGrid[2][2].setBackgroundColor(GREEN);
        }
        else{
            gameGrid[2][2].setBackgroundColor(RED);
        }

        if(gameGrid[2][3].getText()=="12"){
            gameGrid[2][3].setBackgroundColor(GREEN);
        }
        else{
            gameGrid[2][3].setBackgroundColor(RED);
        }

        if(gameGrid[3][0].getText()=="13"){
            gameGrid[3][0].setBackgroundColor(GREEN);
        }
        else{
            gameGrid[3][0].setBackgroundColor(RED);
        }

        if(gameGrid[3][1].getText()=="14"){
            gameGrid[3][1].setBackgroundColor(GREEN);
        }
        else{
            gameGrid[3][1].setBackgroundColor(RED);
        }

        if(gameGrid[3][2].getText()=="15"){
            gameGrid[3][2].setBackgroundColor(GREEN);
        }
        else{
            gameGrid[3][2].setBackgroundColor(RED);
        }

        if(gameGrid[3][3].getText()==" "){
            gameGrid[3][3].setBackgroundColor(GREEN);
        }
        else{
            gameGrid[3][3].setBackgroundColor(RED);
        }
    }

    //make onClick method
    public void onClick(View v){
        //call randomize method
        if(v.getId()==R.id.resetButton){
            randomize();
        }
        //create button object for clicked button
        Button clickedButton = (Button)v;

        //create for loop to go through array
        for(int i=0; i<gameGrid.length; i++){
            for(int j=0; j<gameGrid.length; j++){
                //swap the blank and clicked button
                if(gameGrid[i][j]==clickedButton){
                    //check if move is valid
                    //check left of blank button
                    if((blankI==i-1) && (blankJ==j)){
                        gameGrid[blankI][blankJ].setText(clickedButton.getText());
                        gameGrid[i][j].setText(" ");
                        blankI = i;
                        blankJ = j;
                    }

                    //check right of blank
                    if((blankI==i+1) && (blankJ==j)){
                        gameGrid[blankI][blankJ].setText(clickedButton.getText());
                        gameGrid[i][j].setText(" ");
                        blankI = i;
                        blankJ = j;
                    }

                    //check above blank
                    if((blankI==i) && (blankJ==j-1)){
                        gameGrid[blankI][blankJ].setText(clickedButton.getText());
                        gameGrid[i][j].setText(" ");
                        blankI = i;
                        blankJ = j;
                    }

                    //check below blank
                    if((blankI==i) && (blankJ==j+1)){
                        gameGrid[blankI][blankJ].setText(clickedButton.getText());
                        gameGrid[i][j].setText(" ");
                        blankI = i;
                        blankJ = j;
                    }

                }
            }
        }
        setColor();
    }

    /** External Citation
     * Date: 10 Nov 2019
     * Problem: Could not randomize
     * Resource: Stackoverflow for shuffling ArrayLists
     * Solution: I used the example code from this post.
     */

    /** External Citation
     * Date: 10 Nov 2019
     * Problem: Could not put the text from the string ArrayList on the buttons.
     * Solution: Classmate Mikey Antkiewicz helped me by walking me through the code.
     */

    /** External Citation
     * Date: 10 Nov 2019
     * Problem: Did not know the proper format of the onClick method and swapping the text.
     * Solution: Went to office hours and received help from Prof. Tribelhorn
     */


}
