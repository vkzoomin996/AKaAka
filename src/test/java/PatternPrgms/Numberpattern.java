package PatternPrgms;

import org.testng.annotations.Test;

public class Numberpattern {
	@Test
	public void pattern1() {
//		0
//		1 1
//		2 2 2
//		3 3 3 3
//		4 4 4 4 4
	int n =5;
	// row
	for(int i =0;i<n;i++){
	// col
	for(int j =0;j<n;j++){
	if(i>=j){
	System.out.print(i+" ");
	}else{
	System.out.print(" ");
	}
	}
	System.out.println();
	}
	}
	

	@Test
	public void pattern2() {
//		0
//		0 1
//		0 1 0
//		0 1 0 1
//		0 1 0 1 0
	int n =5;
	// row
	for(int i =0;i<n;i++){
	// col
	for(int j =0;j<n;j++){
	if(i>=j){
	System.out.print(j%2+" ");
	}else{
	System.out.print(" ");
	}
	}
	System.out.println();
	}
	}
	

	@Test
	public void pattern3() {
//		0
//		1 1
//		0 0 0
//		1 1 1 1
//		0 0 0 0 0
	int n =5;
	// row
	for(int i =0;i<n;i++){
	// col
	for(int j =0;j<n;j++){
	if(i>=j){
	System.out.print(i%2+" ");
	}else{
	System.out.print(" ");
	}
	}
	System.out.println();
	}
	}
	

	@Test
	public void pattern4() {
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5
	int n =5;
	// row
	for(int i =0;i<n;i++){
	//col
	for(int j =0;j<n;j++){
	if(i>=j){
	System.out.print(j+1+" ");
	}else{
	System.out.print(" ");
	}
	}
	System.out.println();
	}
	}
	

	@Test
	public void pattern5() {
//		0
//		0 1
//		0 1 0
//		0 1 0 1
//		0 1 0 1 0
	int n =5;
	// row
	for(int i =0;i<n;i++){
	//col
	for(int j =0;j<n;j++){
	if(i>=j){
	System.out.print(j%2+" ");
	}else{
	System.out.print(" ");
	}
	}
	System.out.println();
	}
	}
	

	@Test
	public void pattern6() {
//		1
//		1 0
//		1 0 1
//		1 0 1 0
//		1 0 1 0 1
	int n =5;
	// row
	for(int i =0;i<n;i++){
	//col
	for(int j =0;j<n;j++){
	if(i>=j){
	System.out.print((j+1)%2+" ");
	}else{
	System.out.print(" ");
	}
	}
	System.out.println();
	}
	}


	@Test
	public void pattern7() {
//		5
//		5 4
//		5 4 3
//		5 4 3 2
//		5 4 3 2 1

	int n =5;
	// row
	for(int i =0;i<n;i++){
	//col
	for(int j =0;j<n;j++){
	if(i>=j){
	System.out.print(n-j+" ");
	}else{
	System.out.print(" ");
	}
	}
	System.out.println();
	}
	}
	
	@Test
	public void pattern8() {
//		    5 
//		   4 5 
//		  3 4 5 
//		 2 3 4 5 
//		1 2 3 4 5 
	int n =5;
	// row
	for(int i =0;i<n;i++){
	//col
	for(int j =0;j<n;j++){
	if(i+j>=n-1){
	System.out.print("* ");
	}else{
	System.out.print(" ");
	}
	}
	System.out.println();
	}
	
	}

	@Test
	public void pattern9() {
//		0
//		1 0
//		2 1 0
//		3 2 1 0
//		4 3 2 1 0
	int n =5;
	// row
	for(int i =0;i<n;i++){
	//col
	for(int j =0;j<n;j++){
	if(i>=j){
	System.out.print(i-j+" ");
	}else{
	System.out.print(" ");
	}
	}
	System.out.println();
	}
	
	}

@Test
public void nvj() {
	
	int n=5;
	for (int i = 0; i <  n; i++) {
		for (int j = 0; j <  n; j++) {
			if(i+j>=n-1) {
				System.out.print((j+1)+" ");
			}else {
				System.out.print(" ");

			}
			
		}			System.out.println();

	}
}
@Test
public void fejhj() {
	String[] s= {"abc,cbbnc,cnn"};
}

}
