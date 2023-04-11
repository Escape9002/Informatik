package Netzwerken;

import java.util.ArrayList;

public class Router {
	ArrayList<PaketQueue> queues = new ArrayList<PaketQueue>();
	
	void paketEinfuegen(Netzwerkpaket p) {
			if(queues.get(p.prio) == null) {
				queues.add(new PaketQueue<Netzwerkpaket>(p));
			}else {
				queues.get(p.prio).enqueue(p);
			}
	}
	
	Object paketEntnehmen() {
		int i = 0;
		while(queues.get(i).isEmpty()) {
			i++;
			if(i > (queues.size()-1)) {
				return null;
			}
		}
		return queues.get(i).deqeue();
	}
}
