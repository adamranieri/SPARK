package casino;

public class Gambler {

	public void gamble() {
		
		System.out.println("Going to the Casino to win big! =)");
		double luck = Math.random();
		luck = (int) (luck *100);
		
		
			try {
				playSlots(luck);
				
			}catch(LostShirt s) {
				System.out.println("Pawn grandfathers civil war watch");
			}		
			catch (LostMoney e) {
				System.out.println("Cancel fancy dinner reservation");
			}finally {
				System.out.println("Lie and say you were working late");
			}
	
		
	}
	
	public void playSlots(double luck) throws LostMoney,LostShirt {
		
		if(luck>90) {
			System.out.println("Congratulations you won some money");
		} else if(luck>50) {
			throw new LostMoney();
		}else {
			throw new LostShirt();
		}
		
	}
	
}

