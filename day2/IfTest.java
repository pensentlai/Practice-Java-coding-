class  IfTest
{
	public static void main(String[] args) 
	{
		int age = 23;
		if(age <18 || age >100){
		System.out.println("children!");
	}
    System.out.println("citizen!");

	if(age < 18){
		System.out.println("children!");
	}else{
		System.out.println("adult");
    }

    if(age < 0){
		System.out.println("Erroe!");
	}else if (age < 18){
        System.out.println("children!");
	}else if (age < 60){
        System.out.println("adult!");
	}else if (age < 100){
        System.out.println("older");
	}else{
		System.out.println("death");
  }
}
}
