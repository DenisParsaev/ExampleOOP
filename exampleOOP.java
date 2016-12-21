// Приклади використання принципів ООП у мові програмування Java
// Для спрощення я упустив деякі поля і методи, а також перевірки на виключення 

// Абстрактий клас лишає программу копіювання коду 
public abstract class Human {
    String name;
	abstract String speak();
	abstract String eat();
	public  Human(String name) {
        this.name = name;
    }
}
*** // Показує, що частина коду умовно знаходиться у іншому файлі 
public class Chinese extends Human { // Клас Китаєць наслідує абстрактний клас Людина
	@Override
    public String speak(){
		rememberChineseWord();
		if(mouthOpen = false)
			openMouth();
		useTeethAndLips();
		exhale();
		}
	@Override
    public String eat(){ 
		for(i = 0;i < stomach.length; i++){ 
		// Зававдяки інкапсуляції методи в яких проходить багато процесів все одно безпечні 
		takeСhopsticks();
		if(mouthOpen = false){
			openMouth();
		}
	    if(duck > 0){
		    putPieceOfDuckInMouth();	
	    }else{
		    putRiceInMouth();
		}
		chew();
		swallow();
		}
	}
	public void readMaoBook(){
	openMaoBook();
	for(int num == 1; num<=maoBook.length; num++){
        lookOnPage(num);
    }
    perceiveSymbols();
	}
	public Chinese(String name) {  
        super(name);// Виклик конструктора абстрактного класу Human 
    }
     @Override
    public String toString() {
        return "Китаєць " + name;
    }
}
***
public class Ukrainian implements Human {
	 @Override
    public String speak(){
      rememberUkrainianWord();
		if(mouthOpen = false)
			openMouth();
		useTeethAndLips();
		exhale();
    //Українець, як і Китаєць, теж наслідує абстрактний клас Людина, але реалізація методів різна
	}
	@Override
    public String eat(){
	    takeSpoone();
		if(mouthOpen = false){
		    openMouth();
		}
	    scoopBorshBySpoone();
        putInMouth();
		swallow();		
	}
	public void readKobzar(){
	openKobzar();
	for(int num == 1; num<=kobzar.length; num++){
        lookOnPage(num);
    }
    perceiveSymbols();
	}
	public  Ukrainian(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Українець " + name;
    }
}
***
public class Chuang extends Chinese { 
    public Chuang(String name) { 
        super(name); 
    }
    @Override
    public String toString() {
        return "Чжуан " + name;
    }
	public void writeHieroglyphs(){
		takePen();
		rememberChuangHieroglyphs();
		write();
	}
}
***
public class Life {
 
    public static final void main(String[] args){
        // Послідовно міняємо значення organism
        Human organism = new Chinese("Лі");
        callOrganism(organism);
        organism = new Ukrainian("Богдан");
        callOrganism(organism);
        organism = new Chuang("Ляо");
        callOrganism(organism);
    }
     // Всі люди можуть розмовляти, їсти
    public static void callOrganism(Human organism){
		System.out.println(organism.toString());
        organism.speak();
        organism.eat();
		if(name = "Лі"){ // Так через перевірку на імена код не підходить для масштабування, але в данній программі я гадаю, що це не страшно
		    organism.readMaoBook();	
		}else if(name = "Богдан"){
			organism.readKobzar();
		}else{
			organism.readMaoBook();
			organism.writeHieroglyphs();
		}
    }
 }