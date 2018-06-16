/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsquiz;

/**
 *
 * @Stuart Mackenzie
 */
public class Quiz
{
    String Quiz1;
    String Quiz2; 
    String Quiz3;
    String Quiz4;

    public Quiz()
    {
        Quiz1 = "First";
        Quiz2 = "Second";
        Quiz3 = "Operator2";
        Quiz4 = "Answer";
    }        

    
    public Quiz(String Q1, String Q2, String Op2, String A)
    {
        Quiz1 = Q1;
        Quiz2 = Q2;
        Quiz3 = Op2;
        Quiz4 = A;
    }        

    
}
