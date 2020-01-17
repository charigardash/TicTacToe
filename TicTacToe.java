import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TicTacToe{
JFrame frame;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
JLabel l1,l2;
static int i=1,j1,j2,j3,j4,j5,j6,j7,j8,j9,a1,a2,a3,a4,a5,a6,a7,a8;
public static void main(String[] a){
TicTacToe t=new TicTacToe();
t.play();
}public void set(){
j1=j2=j3=j4=j5=j6=j7=j8=j9=1;
}
public void r1(){
if((b1.getText()).equals(b2.getText())&&(b1.getText()).equals(b3.getText())&&(b1.getText()).equals("X")){
l1.setText("PLAYER1");
//System.exit(0);
set();
}else if((b1.getText()).equals(b2.getText())&&(b1.getText()).equals(b3.getText())&&(b1.getText()).equals("O")){
l1.setText("PLAYER2");
//System.exit(0);
set();
}
}public void r2(){
if((b4.getText()).equals(b5.getText())&&(b4.getText()).equals(b6.getText())&&(b4.getText()).equals("X")){
l1.setText("PLAYER1");
//System.exit(0);
set();
}else if((b4.getText()).equals(b5.getText())&&(b4.getText()).equals(b6.getText())&&(b4.getText()).equals("O")){
l1.setText("PLAYER2");
//System.exit(0);
set();
}
}public void r3(){
if((b7.getText()).equals(b8.getText())&&(b7.getText()).equals(b9.getText())&&(b7.getText()).equals("X")){
l1.setText("PLAYER1");
//System.exit(0);
set();
}else if((b7.getText()).equals(b8.getText())&&(b7.getText()).equals(b9.getText())&&(b7.getText()).equals("O")){
l1.setText("PLAYER2");
//System.exit(0);
set();
}
}public void c1(){
if((b1.getText()).equals(b4.getText())&&(b1.getText()).equals(b7.getText())&&(b4.getText()).equals("X")){
l1.setText("PLAYER1");
//System.exit(0);
set();
}else if((b1.getText()).equals(b4.getText())&&(b1.getText()).equals(b7.getText())&&(b1.getText()).equals("O")){
l1.setText("PLAYER2");
//System.exit(0);
set();
}
}public void c2(){
if((b2.getText()).equals(b5.getText())&&(b2.getText()).equals(b8.getText())&&(b2.getText()).equals("X")){
l1.setText("PLAYER1");
//System.exit(0);
set();
}else if((b2.getText()).equals(b5.getText())&&(b2.getText()).equals(b8.getText())&&(b2.getText()).equals("O")){
l1.setText("PLAYER2");
//System.exit(0);
set();
}
}public void c3(){
if((b3.getText()).equals(b6.getText())&&(b3.getText()).equals(b9.getText())&&(b3.getText()).equals("X")){
l1.setText("PLAYER1");
//System.exit(0);
set();
}else if((b3.getText()).equals(b6.getText())&&(b3.getText()).equals(b9.getText())&&(b3.getText()).equals("O")){
l1.setText("PLAYER2");
//System.exit(0);
set();
}
}public void z1(){
if((b1.getText()).equals(b5.getText())&&(b1.getText()).equals(b9.getText())&&(b1.getText()).equals("X")){
l1.setText("PLAYER1");
//System.exit(0);
set();
}else if((b1.getText()).equals(b5.getText())&&(b1.getText()).equals(b9.getText())&&(b1.getText()).equals("O")){
l1.setText("PLAYER2");
//System.exit(0);
set();
}
}public void z2(){
if((b3.getText()).equals(b5.getText())&&(b3.getText()).equals(b7.getText())&&(b3.getText()).equals("X")){
l1.setText("PLAYER1");
//System.exit(0);
set();
}else if((b3.getText()).equals(b5.getText())&&(b3.getText()).equals(b7.getText())&&(b3.getText()).equals("O")){
l1.setText("PLAYER2");
//System.exit(0);
set();
}
}
public void play(){
frame=new JFrame("TICTACTOE");
l1=new JLabel("RESULT");
l2=new JLabel("PLAYER1");
b1=new JButton();
b2=new JButton();
b3=new JButton();
b4=new JButton();
b5=new JButton();
b6=new JButton();
b7=new JButton();
b8=new JButton();
b9=new JButton();
b10=new JButton("RESET");
l1.setBounds(100,500,100,25);
l2.setBounds(100,400,100,25);
l1.setOpaque(true);
l2.setOpaque(true);
l1.setBackground(Color.WHITE);
l2.setBackground(Color.gray);
b1.setBackground(Color.BLUE);
b2.setBackground(Color.BLUE);
b3.setBackground(Color.BLUE);
b4.setBackground(Color.BLUE);
b5.setBackground(Color.BLUE);
b6.setBackground(Color.BLUE);
b7.setBackground(Color.BLUE);
b8.setBackground(Color.BLUE);
b9.setBackground(Color.BLUE);
b10.setBackground(Color.BLUE);
b1.addActionListener(new Bn());
b2.addActionListener(new Bn2());
b3.addActionListener(new Bn3());
b4.addActionListener(new Bn4());
b5.addActionListener(new Bn5());
b6.addActionListener(new Bn6());
b7.addActionListener(new Bn7());
b8.addActionListener(new Bn8());
b9.addActionListener(new Bn9());
b10.addActionListener(new Bn10());
b1.setBounds(100,100,100,100);
b2.setBounds(200,100,100,100);
b3.setBounds(300,100,100,100);
b4.setBounds(100,200,100,100);
b5.setBounds(200,200,100,100);
b6.setBounds(300,200,100,100);
b7.setBounds(100,300,100,100);
b8.setBounds(200,300,100,100);
b9.setBounds(300,300,100,100);
b10.setBounds(200,400,100,25);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setBackground(Color.BLACK);
frame.setLayout(null);
frame.getContentPane().add(l1);
frame.getContentPane().add(l2);
frame.getContentPane().add(b1);
frame.getContentPane().add(b2);
frame.getContentPane().add(b3);
frame.getContentPane().add(b4);
frame.getContentPane().add(b5);
frame.getContentPane().add(b6);
frame.getContentPane().add(b7);
frame.getContentPane().add(b8);
frame.getContentPane().add(b9);
frame.getContentPane().add(b10);
frame.setSize(600,600);
frame.setVisible(true);
}class Bn10 implements ActionListener{
public void actionPerformed(ActionEvent e){
j1=j2=j3=j4=j5=j6=j7=j8=j9=0;
a1=a2=a3=a4=a5=a6=a7=a8=0;
i=1;
l1.setText("RESULT");
l2.setText("PLAYER1");
b1.setText("");
b2.setText("");
b3.setText("");
b4.setText("");
b5.setText("");
b6.setText("");
b7.setText("");
b8.setText("");
b9.setText("");
}
}
class Bn implements ActionListener{
public void actionPerformed(ActionEvent e){

if(j1==0){
if(i%2==0){
b1.setText("O");
l2.setText("PLAYER1");
i++;
j1++;
}else{
b1.setText("X");
l2.setText("PLAYER2");
i++;
j1++;
}
}
if(j1==j2&&j2==j3&&j3==1&&a1==0){
r1();
a1++;
}
else if(j1==j4&&j4==j7&&j7==1&&a2==0){
c1();
a2++;
}else if(j1==j5&&j5==j9&&j9==1&&a3==0){
z1();
a3++;
}
}
}class Bn2 implements ActionListener{
public void actionPerformed(ActionEvent e){

if(j2==0){
if(i%2==0){
b2.setText("O");
l2.setText("PLAYER1");
i++;
j2++;
}else{
b2.setText("X");
l2.setText("PLAYER2");
i++;
j2++;
}
}if(j2==j3&&j3==j1&&j1==1&&a1==0){
r1();
a1++;
}else if(j2==j5&&j5==j8&&j8==1&&a4==0){
c2();
a4++;
}
}
}class Bn3 implements ActionListener{
public void actionPerformed(ActionEvent e){

if(j3==0){
if(i%2==0){
b3.setText("O");
l2.setText("PLAYER1");
i++;
j3++;
}else{
b3.setText("X");
l2.setText("PLAYER2");
i++;
j3++;
}
}if(j3==j2&&j2==j1&&j1==1&&a1==0){
r1();
a1++;
}else if(j3==j6&&j6==j9&&j9==1&&a5==0){
c3();
a5++;
}else if(j3==j5&&j5==j7&&j7==1&&a6==0){
z2();
a6++;
}
}
}class Bn4 implements ActionListener{
public void actionPerformed(ActionEvent e){

if(j4==0){
if(i%2==0){
b4.setText("O");
l2.setText("PLAYER1");
i++;
j4++;
}else{
b4.setText("X");
l2.setText("PLAYER2");
i++;
j4++;
}
}if(j4==j1&&j1==j7&&j7==1&&a2==0){
c1();
a2++;
}else if(j4==j5&&j5==j6&&j6==1&&a7==0){
r2();
a7++;
}
}
}class Bn5 implements ActionListener{
public void actionPerformed(ActionEvent e){

if(j5==0){
if(i%2==0){
b5.setText("O");
l2.setText("PLAYER1");
i++;
j5++;
}else{
b5.setText("X");
l2.setText("PLAYER2");
i++;
j5++;
}
}if(j5==j3&&j3==j7&&j7==1&&a6==0){
z2();
a6++;
}else if(j5==j2&&j2==j8&&j8==1&&a4==0){
c2();
a4++;
}else if(j4==j5&&j5==j6&&j6==1&&a7==0){
r2();
a7++;
}else if(j1==j5&&j5==j9&&j9==1&&a3==0){
z1();
a3++;
}
}
}class Bn6 implements ActionListener{
public void actionPerformed(ActionEvent e){

if(j6==0){
if(i%2==0){
b6.setText("O");
l2.setText("PLAYER1");
i++;
j6++;
}else{
b6.setText("X");
l2.setText("PLAYER2");
i++;
j6++;
}
}if(j6==j5&&j5==j4&&j4==1&&a7==0){
r2();
a7++;
}else if(j6==j3&&j3==j9&&j9==1&&a5==0){
c3();
a5++;
}
}
}class Bn7 implements ActionListener{
public void actionPerformed(ActionEvent e){
if(j7==0){
if(i%2==0){
b7.setText("O");
l2.setText("PLAYER1");
i++;
j7++;
}else{
b7.setText("X");
l2.setText("PLAYER2");
i++;
j7++;
}
}if(j7==j8&&j8==j9&&j9==1&&a8==0){
r3();
a8++;
}else if(j1==j4&&j4==j7&&j7==1&&a2==0){
c1();
a2++;
}else if(j7==j5&&j5==j3&&j3==1&&a6==0){
z2();
a6++;
}
}
}class Bn8 implements ActionListener{
public void actionPerformed(ActionEvent e){

if(j8==0){
if(i%2==0){
b8.setText("O");
l2.setText("PLAYER1");
i++;
j8++;
}else{
b8.setText("X");
l2.setText("PLAYER2");
i++;
j8++;
}
}if(j8==j7&&j7==j9&&j9==1&&a8==0){
r3();
a8++;
}else if(j8==j5&&j5==j2&&j2==1&&a4==0){
c2();
a4++;
}
}
}class Bn9 implements ActionListener{
public void actionPerformed(ActionEvent e){

if(j9==0){
if(i%2==0){
b9.setText("O");
l2.setText("PLAYER1");
i++;
j9++;
}else{
b9.setText("X");
l2.setText("PLAYER2");
i++;
j9++;
}
}if(j9==j6&&j6==j3&&j3==1&&a5==0){
c3();
a5++;
}else if(j7==j8&&j8==j9&&j9==1&&a8==0){
r3();
a8++;
}else if(j9==j5&&j5==j1&&j1==1&&a3==0){
z1();
a3++;
}
}
}
}