package uebungListe;
public class ListenElement {
	
	
	private int inhalt;
	public ListenElement next;
	public ListenElement previous;
	
	
	public ListenElement (int inhalt){
		this.inhalt = inhalt;
	}

	public boolean isEmpty() {return true;}
	
	public void top() {}
	
	public void add(ListenElement neu){
		 if(next==null){
			 next=neu;
		 }else{
			 next.add(neu);
		 }
	}
	
	public void remove() {
		if(next==null) {
			System.out.println(inhalt);
		
	}else {
		next.remove();
	}
		return;
}
	
	 public int getGroesse(int anzahl){
		 int zahl = anzahl+1;
		 if(next!=null){
			return next.getGroesse(zahl);}
		 
		 return zahl;
			 
		 }
	 
	 public String getInhalt() {
		 return ""+inhalt;
	 }
	 
	 public String toString(){
			if(next== null){
					return ""+inhalt;
				}else{
					return ""+inhalt+" "+next.toString();
				}
			}

	}
	
	
