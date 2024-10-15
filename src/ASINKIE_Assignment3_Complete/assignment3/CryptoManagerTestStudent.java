package assignment3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class CryptoManagerTestStudent {
    private CryptoManager cm;
    
    @Before
    public void setUp() throws Exception {
        cm = new CryptoManager();
    }

    @Test
    public void testStringInBounds() {
        assertTrue(cm.stringInBounds("DE23F"));
        assertTrue(cm.stringInBounds("GHI4JK23"));
        assertTrue(cm.stringInBounds("MN1OPla3Q"));
        assertTrue(cm.stringInBounds("STUpVWX"));
        assertTrue(cm.stringInBounds("YZ;lm/ ."));
        assertTrue(cm.stringInBounds("ab522s32"));
        assertTrue(cm.stringInBounds("fghgw6ij"));
        assertTrue(cm.stringInBounds("2533"));
        assertTrue(cm.stringInBounds("pq235"));
        assertTrue(cm.stringInBounds("uvwxy"));
        assertTrue(cm.stringInBounds("325z"));
        assertTrue(cm.stringInBounds("01225234"));
        assertTrue(cm.stringInBounds("56525789"));
        assertTrue(cm.stringInBounds("!asf44t^"));
        assertTrue(cm.stringInBounds("&4324)_"));
        assertTrue(cm.stringInBounds("-asdfa/"));
        assertTrue(cm.stringInBounds("kdjdfdsf"));
        
        assertFalse(cm.stringInBounds("ÄËÏÖÜŸ"));
        assertFalse(cm.stringInBounds("àèìòù"));
        assertFalse(cm.stringInBounds("áéíóú"));
        assertFalse(cm.stringInBounds("âêîôû"));
        assertFalse(cm.stringInBounds("ãñõ"));
        assertFalse(cm.stringInBounds("äëïöüÿ"));
        assertFalse(cm.stringInBounds("āēīōū"));
        assertFalse(cm.stringInBounds("ąćęłńóśźż"));
        assertFalse(cm.stringInBounds("ÆØÅæøå"));
        assertFalse(cm.stringInBounds("ß"));
        assertFalse(cm.stringInBounds("Çç"));
    }

    @Test
    public void testEncryptCaesar() {
        assertEquals("MYHUR VJLHU", cm.encryptCaesar("FRANK OCEAN", 7));
        assertEquals("OJLFT", cm.encryptCaesar("NIKES", 1));
    }

    @Test
    public void testDecryptCaesar() {
        assertEquals("FRANK OCEAN", cm.decryptCaesar("MYHUR VJLHU", 7));
        assertEquals("NIKES", cm.decryptCaesar("OJLFT", 1));

    }

    @Test
    public void testEncryptBellaso() {
        try {
            assertEquals("IZJO!%RKNB$", cm.encryptBellaso("FRANK OCEAN", "CHIAVE"));
            assertEquals("PUZSW", cm.encryptBellaso("NIKES", "BLONDE"));
    }
    @Test
    public void testDecryptBellaso() {
        assertEquals("FRANK OCEAN", CryptoManager.bellasoDecryption("IZJO!%RKNB$", "CHIAVE"));
        assertEquals("NIKES", CryptoManager.bellasoDecryption("PUZSW", "BLONDE"));

    }
}