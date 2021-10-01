class Animal{

void eat(){System.out.println("eating.....");}
}

class Dog extends Animal{

void eat(){System.out.println("eating pedigree.....");}
}

class Cat extends Animal{

void eat(){System.out.println("eating rat.....");}
}

class Lion extends Animal{

void eat(){System.out.println("eating meat.....");}
}

class RunTimePoly6{

public static void main(String[] arg){

Animal a;

a=new Dog();
a.eat();

a=new Cat();
a.eat();

a=new Lion();
a.eat();

a=new Animal();
a.eat();

}
}