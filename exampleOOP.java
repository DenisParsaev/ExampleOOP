// Приклади використання принципів ООП у мові програмування Java
// Для спрощення я упустив деякі поля і методи, а також перевірки на виключення 

// Інтерфейс забезпечує одразу декілька принципів ООП: абстракція, наслідування, поліморфізм
public interface Human { // Інтерфейс Людина
	String speak();
	String eat();
	String pay();
}
*** // Показує, що частина коду умовно знаходиться у іншому файлі 
public class Chinese implements Human { // Клас Китаєць реалізує інтерфейс Людина
    private String name; // По канонам інкапсуляції всі поля повинні бути з модифікатором private
	
	@Override
    public String speak(){
		return "Розмовляє на китайскій";
	}
	@Override
    public String eat(){ 
		for(i = 0;i < stomach.length; i++){ 
		// Зававдяки інкапсуляції методи в яких проходить багато процесів все одно безпечні 
		    if(duck > 0){
				return "Їсть качку по-пекински";	
			}else{
				return "Їсть рис";
			}
		}
	}
	@Override
    public String pay(){
		return "Платить китайським юанем";
	}
	
    public Chinese(String name) { 
	// Саме тут і рятує інкапсуляція: наприклад, можна зробити перевірку на валідність введеного імені
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
	 /*Хоча Українець і Китаєць звязані спільним інтерфейсом, але вони можуть працювати один без іншого
	 Це забеспечує роботу клієнського коду з інтерфейсом не маючи інформації про класи, що реалізують цей
	 інтерфейс*/
	@Override
    public String speak(){
		return "Розмовляє на українській";  
    //Українець, як і Китаєць, теж реалізує інтерфейс Людина, але реалізація методів різна
	}
	@Override
    public String eat(){
		return "Їсть борщ";
	}
	@Override
    public String pay(){
		return "Платить гривнею";
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
    public Chuang(String name) { 
        super(name); // Виклик конструктора суперкласа
    }
    @Override
    public String toString() {
        return "Чжуан " + name;
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
     // Всі люди можуть розмовляти, їсти, платити
    public static void callOrganism(Human organism){
		System.out.println(organism.toString());
        System.out.println(organism.speak());
        System.out.println(organism.eat());
		System.out.println(organism.pay());
    }
 }