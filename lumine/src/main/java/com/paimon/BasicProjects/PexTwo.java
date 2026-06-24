package com.paimon.BasicProjects;

public class PexTwo {
    
    // Rotor wirings (permutations of A-Z)
    private static final String[] ROTOR_WIRINGS = {
        "EKMFLGDQVZNTOWYHXUSPAIBRCJ", // Rotor I
        "AJDKSIRUXBLHWTMCQGZNPYFVOE", // Rotor II
        "BDFHJLCPRTXVZNYEIWGAKMUSQO"  // Rotor III
    };
    
    // Reflector wiring (maps A-Z back symmetrically)
    private static final String REFLECTOR = "YRUHQSLDPXNGOKMIEBFZCWVJAT";
    
    // Rotor positions and states
    private int[] rotorPositions;
    private String[] rotorWirings;
    private int notchPosition = 16; // Position where rotor steps next rotor
    
    /**
     * Initialize Enigma machine with starting rotor positions
     * @param position1 Position of rotor 1 (0-25)
     * @param position2 Position of rotor 2 (0-25)
     * @param position3 Position of rotor 3 (0-25)
     */
    public PexTwo(int position1, int position2, int position3) {
        this.rotorPositions = new int[]{position1, position2, position3};
        this.rotorWirings = new String[]{
            ROTOR_WIRINGS[0],
            ROTOR_WIRINGS[1],
            ROTOR_WIRINGS[2]
        };
    }
    
    /**
     * Step the rotors (advance rightmost first, with cascading)
     */
    private void stepRotors() {
        rotorPositions[2]++; // Step rightmost rotor
        
        // Cascade stepping when rotor hits notch
        if (rotorPositions[2] > 25) {
            rotorPositions[2] = 0;
            rotorPositions[1]++;
            
            if (rotorPositions[1] > 25) {
                rotorPositions[1] = 0;
                rotorPositions[0]++;
                if (rotorPositions[0] > 25) {
                    rotorPositions[0] = 0;
                }
            }
        }
    }
    
    /**
     * Apply rotor transformation (forward direction)
     */
    private char applyRotor(char letter, int rotorIndex, boolean reverse) {
        int charIndex = letter - 'A';
        String wiring = rotorWirings[rotorIndex];
        int offset = rotorPositions[rotorIndex];
        
        // Add offset for current rotor position
        charIndex = (charIndex + offset) % 26;
        
        if (reverse) {
            // Going backward through rotor
            int resultIndex = wiring.indexOf(((char) ('A' + charIndex)));
            return (char) ('A' + (resultIndex - offset + 26) % 26);
        } else {
            // Going forward through rotor
            char result = wiring.charAt(charIndex);
            return (char) ('A' + (result - 'A' - offset + 26) % 26);
        }
    }
    
    /**
     * Apply reflector transformation
     */
    private char applyReflector(char letter) {
        return REFLECTOR.charAt(letter - 'A');
    }
    
    /**
     * Encrypt a single character
     */
    public char encryptChar(char letter) {
        if (!Character.isLetter(letter)) {
            return letter;
        }
        
        letter = Character.toUpperCase(letter);
        stepRotors();
        
        // Forward pass through rotors (right to left)
        letter = applyRotor(letter, 2, false);
        letter = applyRotor(letter, 1, false);
        letter = applyRotor(letter, 0, false);
        
        // Through reflector
        letter = applyReflector(letter);
        
        // Backward pass through rotors (left to right)
        letter = applyRotor(letter, 0, true);
        letter = applyRotor(letter, 1, true);
        letter = applyRotor(letter, 2, true);
        
        return letter;
    }
    
    /**
     * Encrypt a full message
     */
    public String encrypt(String message) {
        StringBuilder result = new StringBuilder();
        for (char c : message.toCharArray()) {
            result.append(encryptChar(c));
        }
        return result.toString();
    }
    
    /**
     * Reset rotor positions
     */
    public void reset(int pos1, int pos2, int pos3) {
        rotorPositions[0] = pos1;
        rotorPositions[1] = pos2;
        rotorPositions[2] = pos3;
    }
    
    /**
     * Get current rotor positions
     */
    public String getRotorState() {
        return String.format("Rotor Positions: [%d, %d, %d]", 
            rotorPositions[0], rotorPositions[1], rotorPositions[2]);
    }
    
    // Test the Enigma machine
    public static void main(String[] args) {
        PexTwo enigma = new PexTwo(0, 0, 0);
        
        String plaintext = "Marie Fialet";
        String encrypted = enigma.encrypt(plaintext);
        System.out.println("Plaintext:  " + plaintext);
        System.out.println("Encrypted:  " + encrypted);
        System.out.println(enigma.getRotorState());
        
        // Reset and test again (should produce same result)
        enigma.reset(0, 0, 0);
        String decrypted = enigma.encrypt(encrypted);
        System.out.println("Decrypted:  " + decrypted);
    }
}
