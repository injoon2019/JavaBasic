class Friend{	//ģ�� ����
	String name;
	Company cmp;	//null �� �� ����
	
	public Friend(String n, Company c){
		name = n;
		cmp =c;
	}
	public String getName(){return name;}
	public Company getCmp(){return cmp;}
}

class Company{	//'ģ�� ����'�� ���ϴ� 'ȸ�� ����'
	String cName;
	ContInfo cInfo;	//null�� �� ����
	
	public Company(String cn, ContInfo ci){
		cName = cn;
		cInfo = ci;
	}
	public String getCName(){return cName;}
	public ContInfo getCInfo(){return cInfo;}
}

class ContInfo{	//ȸ�� ������ ���ϴ� ȸ�� ������
	String phone; //null�� �� ����
	String adrs;	//null�� �� ����

	public ContInfo(String ph, String ad){
		phone = ph;
		adrs= ad;
	}
	public String getPhone(){return phone;}
	public String getAdrs(){return adrs;}
}

class NullPointerCaseStudy{
	public static void main(String[] args)//ģ���� �ٴϴ� ȸ�� �ּ� ���
		String addr = null;
		if(f != null){
			Company com=  f.getCmp();
	
			if( com != null){
				ContInfo info =  com.getCInfo();
				if(info!= null)
					addr = info.getAdrs();
			}
		}
		
		if(addr != null)
			System.out.println(addr);
		else
			System.out.println("There's no address information");
	}

	public static void main(String[] args){
		ContInfo ci = new ContInfo("321-444-577", "Republic of Korea");
		Company cp = new Company("YaHo co., Ltd.", ci);
		Friend frn = new Friend("Lee SU", cp);
		showCompAddr(frn);
	}
}