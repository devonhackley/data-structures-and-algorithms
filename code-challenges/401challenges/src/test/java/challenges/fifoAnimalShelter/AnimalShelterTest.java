package challenges.fifoAnimalShelter;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    @Test public void testAnimalShelterConstructor(){
        AnimalShelter shelter = new AnimalShelter();

        assertNull(shelter.getLongest());
        assertNull(shelter.getNewest());
        assertEquals(0, shelter.getSize());
    }

    @Test public void testAnimalShelterEnqueue(){
        AnimalShelter shelter = new AnimalShelter();
        Animal animal = new Animal("dog");
        shelter.enqueue(animal);
        assertEquals(animal.getType(), shelter.getLongest().val.getType());
        assertEquals(animal.getType(), shelter.getNewest().val.getType());
        assertEquals(1, shelter.getSize());
    }

    @Test public void testAnimalShelterEnqueueMultiple(){
        AnimalShelter shelter = new AnimalShelter();
        Animal animal = new Animal("dog");
        Animal animal1 = new Animal("dog");
        Animal animal2 = new Animal("dog");
        Animal animal3 = new Animal("cat");

        shelter.enqueue(animal);
        shelter.enqueue(animal1);
        shelter.enqueue(animal2);
        shelter.enqueue(animal3);
        assertEquals(animal3.getType(), shelter.getNewest().val.getType());
        assertEquals(animal.getType(), shelter.getLongest().val.getType());
        assertEquals(4, shelter.getSize());
    }

    @Test public void testAnimalShelterDequeue(){
        AnimalShelter shelter = new AnimalShelter();
        Animal animal = new Animal("dog");
        Animal animal1 = new Animal("dog");
        Animal animal2 = new Animal("dog");
        Animal animal3 = new Animal("cat");

        shelter.enqueue(animal);
        shelter.enqueue(animal1);
        shelter.enqueue(animal2);
        shelter.enqueue(animal3);
        assertEquals(4, shelter.getSize());

        Animal result = shelter.dequeue("cat");
        System.out.println(result);
        assertEquals(3, shelter.getSize());
        assertEquals("cat", result.getType());
    }

    @Test public void testAnimalShelterDequeueMany(){
        AnimalShelter shelter = new AnimalShelter();
        Animal animal = new Animal("dog");
        Animal animal1 = new Animal("dog");
        Animal animal2 = new Animal("dog");
        Animal animal3 = new Animal("cat");

        shelter.enqueue(animal);
        shelter.enqueue(animal1);
        shelter.enqueue(animal2);
        shelter.enqueue(animal3);
        assertEquals(4, shelter.getSize());

        shelter.dequeue("dog");
        Animal animal4 = new Animal("cat");
        shelter.enqueue(animal4);
        shelter.dequeue("cat");

        assertEquals(3, shelter.getSize());
        assertEquals("cat", shelter.getNewest().val.getType());

    }
}