// Java program to implement a
// Car class

// Creating a Car class
public class Car {

	// Data members of the
	// Car class
	int id;
    String matricule;
	String marque;
	String vitesse;
    Date capture_info;
	String vitesse_limite;

     // Constructor of the Car
    // class
    public Car()
    {
    }
	// Constructor of the Car
	// class
	public Car(int id,
    String matricule,
	String marque,
	String vitesse,
    Date capture_info,
	String vitesse_limite,)
	{
		this.id = id;
		this.matricule = matricule;
		this.marque = marque;
        this.vitesse = vitesse;
		this.capture_info = capture_info;
        this.vitesseLimite = vitesse_limite;
	}

	// Implementing the getters
	// and setters
	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getMatricule()
	{
		return matricule;
	}

	public void setMatricule(String matricule)
	{
		this.matricule = matricule;
	}

	public String getMarque()
	{
		return marque;
	}

	public void setMarque(String marque)
	{
		this.marque = marque;
	}
    public String getVitesse()
	{
		return vitesse;
	}

	public void setVitesse(String vitesse)
	{
		this.vitesse = vitesse;
	}

	public String getVitesseLimite()
	{
		return vitesse_vimite;
	}

	public void setVitesseLimite(String vitesseLimite)
	{
		this.vitesse_limite = vitesse_vimite;
	}
    
    public String getCaptureInfo()
	{
		return capture_info;
	}

	public void setCaptureInfo(String capture_info)
	{
		this.capture_info = capture_info;
	}
    @Override
    public String toString()
    {
        return "Car{"
            + "id = " + id
            + ", matricule = '" + matricule + "'"
            + ", marque = '" + marque + "'"
            + ", vitesse = '" + vitesse + "'"
            + ", vitesse_vimite = '" + vitesse_vimite + "'"
            + ", capture_info = '" + capture_info + "'"
            + "}";
    }
}
