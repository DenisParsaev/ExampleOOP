// Приклади використання принципів ООП у мові програмування Java
// Для спрощення я упустив деякі поля і методи, а також перевірки на виключення 

// Інтерфейс забезпечує одразу декілька принципів ООП: абстракція, наслідування, поліморфізм
public interface Human { // Інтерфейс Людина
	String speak();
	String eat();
}
*** // Показує, що частина коду умовно знаходиться у іншому файлі 
public class Chinese implements Human { // Клас Китаєць реалізує інтерфейс Людина
    private String name; // По канонам інкапсуляції всі поля повинні бути з модифікатором private
	int a = 0;
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
		    putAPieceOfDuckInMouth();	
	    }else{
		    putRiceInMouth();
		}
		chew();
		swallow();
		}
	}
	public void readMaoBook(){
	openMaoBook();
	for(int num == 1; num<=maoBook.length; num++)
        lookOnPage(num);
    }
    perceiveSymbols();
	}
	public Chinese(String name) { 
	/*Саме тут і рятує інкапсуляція: наприклад, можна зробити перевірку на валідність введеного імені,
	але я її не зробив:)*/ 
        this.name = name;
    }
     @Override
    public String toString() {
        return "Китаєць " + name;
    }
}
***
public class Ukrainian implements Human {
	private name;
	int a = 1;
	 /*Хоча Українець і Китаєць звязані спільним інтерфейсом, але вони можуть працювати один без іншого
	 Це забеспечує роботу клієнського коду з інтерфейсом не маючи інформації про класи, що реалізують цей
	 інтерфейс*/
	@Override
    public String speak(){
      rememberUkrainianWord();
		if(mouthOpen = false)
			openMouth();
		useTeethAndLips();
		exhale();
		}
    //Українець, як і Китаєць, теж реалізує інтерфейс Людина, але реалізація методів різна
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
        this.name = name;
    }
    @Override
    public String toString() {
        return "Українець " + name;
    }
}
***
public class Chuang extends Chinese { // Клас Чжуан є наслідником класу Китаєць, що усуває копіювання коду
    int a = 2;
    public Chuang(String name) { 
        super(name); // Виклик конструктора суперкласа
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
		if(a = 0){
		    organism.readMaoBook();	
		}else if(a = 1){
			organism.readKobzar();
		}else{
			organism.readMaoBook();
			organism.writeHieroglyphs();
		}
    }
 }