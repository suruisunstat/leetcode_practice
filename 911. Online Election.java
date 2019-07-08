class TopVotedCandidate {
    private List<Vote> A;
    public TopVotedCandidate(int[] persons, int[] times) {
        A = new ArrayList();
        Map<Integer, Integer> count = new HashMap();
        int leader = -1;
        int m = 0;
        
        for (int i = 0; i < persons.length; i++) {
            int p = persons[i], t = times[i];
            int c = count.getOrDefault(p,0) + 1;
            count.put(p,c);
            if (c >= m) {
                if (p != leader) {
                    leader = p;
                    A.add(new Vote(p,t));
                }
                
                if (c > m)
                    m = c;
            }
        }
    }
    
    public int q(int t) {
        int lo = 1, hi = A.size();
        while (lo < hi) {
            int mi = lo + (hi - lo)/2;
            if (A.get(mi).time <= t) {
                lo = mi + 1;
            }
            else
                hi = mi;
        }
        return A.get(lo-1).person;
    }
    
    
    
class Vote{
    int person;
    int time;
    public Vote(int p, int t) {
        person = p;
        time = t;
    }
}
}
