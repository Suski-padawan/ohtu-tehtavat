/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author susan
 */
public class StatisticsTest {
    Reader readerStub = new Reader() {
 
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();
 
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
 
            return players;
        }
    };
 
    Statistics stats;

    @Before
    public void setUp(){
        // luodaan Statistics-olio joka käyttää "stubia"
        stats = new Statistics(readerStub);
        
    }
    
    @Test
    public void pelaajaLoytyy() {       
        Player Kurri=new Player("Kurri",   "EDM", 37, 53);
        assertEquals(Kurri.getName(),stats.search("Kurri").getName());
    }
    
    @Test
    public void pelaajaaEiLoydy() {
        assertNull(stats.search("Kulli"));
    }
    
    @Test
    public void tiimihakuPalauttaaOikein() {
        ArrayList<Player> testipelaajat=new ArrayList<>();
        testipelaajat.add(new Player("Yzerman", "DET", 42, 56));
        
        assertEquals(testipelaajat.get(0).getTeam(),stats.team("DET").get(0).getTeam());
    }
    
    @Test
    public void topScoreHakuPalauttaaOikein() {
        ArrayList<Player> testipelaajat=new ArrayList<>();
        testipelaajat.add(new Player("Gretzky", "EDM", 35, 89));
        
        assertEquals(testipelaajat.get(0).getPoints(),stats.topScorers(1).get(0).getPoints());
    }
    
    
}
