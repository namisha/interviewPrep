package com.prep.tree;

import java.util.HashMap;

public class CoinsDenomination {

	public HashMap<Integer,Integer> getDenomination(int totalMoneyVal, HashMap<Integer,Integer> m){
		HashMap<Integer,Integer> d = new HashMap<>();
		
		HashMap<String,Integer> a = cal(25,m.get(25),totalMoneyVal);
		int newVal = a.get("val");
		if((a.get("val")==totalMoneyVal || a.get("val")==0) && a.get("numberOfCoins")!=0){
			d.put(a.get("denomination"),a.get("numberOfCoins"));
				return d;
		}
		else{
			d.put(a.get("denomination"),a.get("numberOfCoins"));
			HashMap<String,Integer> b = cal(10,m.get(10),newVal);
			if((b.get("val")==newVal || b.get("val")==0) && b.get("numberOfCoins")!=0){
				d.put(b.get("denomination"),b.get("numberOfCoins"));
					return d;
			}
			else{
				d.put(b.get("denomination"),b.get("numberOfCoins"));
				newVal = b.get("val");
				HashMap<String,Integer> c = cal(5,m.get(5),newVal);
				if((c.get("val")==newVal || c.get("val")==0)  && c.get("numberOfCoins")!=0){
					d.put(c.get("denomination"),c.get("numberOfCoins"));
						return d;
				}
				else {
					d.put(c.get("denomination"),c.get("numberOfCoins"));
					newVal = c.get("val");
					HashMap<String,Integer> e = cal(1,m.get(1),newVal);
					if(e.get("val")==newVal || e.get("val")==0){
						d.put(e.get("denomination"),e.get("numberOfCoins"));
						if(e.get("val")==0){
							return d;
						}
					}
					else {
						d.put(e.get("denomination"),e.get("numberOfCoins"));
						System.out.println("not enough coins");
						return null;
					}
				}
			}
		}
		return d;
	}
	
	public HashMap<String,Integer> cal(int denomination, int numberOfCoins, int val){
		HashMap<String,Integer> denom = new HashMap<>();
		int retrunVal = 0;
		if(numberOfCoins==0){
			denom.put("denomination",denomination);
			denom.put("numberOfCoins",numberOfCoins);
			denom.put("val",val);
		}
		else if(denomination*numberOfCoins==val){
			denom.put("denomination",denomination);
			denom.put("numberOfCoins",numberOfCoins);
			denom.put("val",0);
		}
		else if(denomination*numberOfCoins<val){
			denom.put("denomination",denomination);
			denom.put("numberOfCoins",numberOfCoins);
			denom.put("val",val- denomination*numberOfCoins);
		}
		else if(denomination*numberOfCoins>val){
			HashMap<String,Integer> h = cal(denomination,numberOfCoins-1,val);
			denom.put("denomination",h.get("denomination"));
			denom.put("numberOfCoins",h.get("numberOfCoins"));
			denom.put("val",h.get("val"));
		}
		return denom;
	}
	
	public static void main(String args[]){
		CoinsDenomination f = new CoinsDenomination();
		HashMap<Integer,Integer> n = new HashMap<>();
		n.put(25, 0);
		n.put(10,0);
		n.put(5, 0);
		n.put(1, 1);
		HashMap<Integer,Integer> ret = f.getDenomination(100, n);
		System.out.println("ret :" + ret);
	}
}
