package view;

import model.Lista;

public class Main {
	public static void main(String[] args) throws Exception {
		Lista l = new Lista();
		int[] vetor = {10,5,8,1,9,2,4,7,3,6};
		l.vectorInit(vetor, l);
		
		l = ordenarLista(l);
		l.printList(l);
	}

	private static Lista ordenarLista(Lista l) throws Exception {
		for(int i=0;i<l.size();i++) {
			for(int j=i+1;j<l.size();j++) {
				if(l.get(i) > l.get(j)) {
					int aux = l.get(j);
					l.add(l.get(i), j);
					l.remove(j+1);
					l.add(aux, i);
					l.remove(i+1);
				}
			}
		}
		return l;
	}
}
