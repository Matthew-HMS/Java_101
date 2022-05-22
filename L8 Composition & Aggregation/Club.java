public class Club {
    private Member[] members = new Member[10];
    private int count = 0;
    private int entercount = 0;

    public int getCount(){return count;}
    public int getEnterCount(){return entercount;}
    public void addMember(Member m){
        entercount++;
        if(getEnterCount() > members.length){
            System.out.printf("Too late, the club is full. The club can only have %d members.\n", members.length);
            System.out.printf("There are %d members want to join the club.\n", getEnterCount());
        }
        else{
            for(int i = 0; i < members.length; i++){
                if(members[i] == null){
                    members[i] = m;
                    count++;
                    break;
                }
            }
        }
    }
    public void removeMember(Member m){
        int count = 0;
        for(int i = 0; i < members.length; i++){
            if(members[i] == m){
                members[i] = null;
                this.count--;
                break;
            }
            else count++;
            
        }
        if (count == members.length){
            System.out.printf("%s is not in the club.\n",m.getName());
        }
    }
    public int totalFees(){
        int total = 0;
        for(int i = 0; i < members.length; i++){
            if(members[i] != null){
                total += members[i].getFee();
            }
        }
        return total;
    }
    public String toString(){
        String output = "Members list: \n";
        for(int i = 0; i < members.length; i++){
            if(members[i] != null){
                output += members[i].toString() + "\n";
            }
        }
        return output;
    }
    
}
