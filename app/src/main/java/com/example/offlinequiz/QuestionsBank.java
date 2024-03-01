package com.example.offlinequiz;

import androidx.appcompat.view.menu.MenuBuilder;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> botanyQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Which part of the plant is below the soil and is usually brown in color?", "Flower", "Fruit", "Root", "Stem", "Root", "");
        final QuestionsList question2 = new QuestionsList("Is the process of transporting the male gamete from the male flower parts to the female flower parts.", "Asexual Reproduction", "Photosynthesis", "Pollination", "Vasculation", "Pollination", "");
        final QuestionsList question3 = new QuestionsList("After fertilization, what does the ovary develop into?", "Seed", "Fruit", "Bud", "Flower", "Fruit", "");
        final QuestionsList question4 = new QuestionsList("What is an Angiosperm?", "Nonvascular plants", "Vascular seedless plants", "Vascular seed plants that produce seeds in cones", "Vascular seed plants that produce seeds in flowers", "Vascular seed plants that produce seeds in flowers", "");
        final QuestionsList question5 = new QuestionsList("Which are plants that grow, mature, flower, produce seeds, and die in one growing season?", "Annual", "Biennial", "Perennial", "None of the above", "Annual", "");
        final QuestionsList question6 = new QuestionsList("After fertilization, what does the ovule develop into?", "Fruit", "Bud", "Seed", "Flower", "Seed", "");
        final QuestionsList question7 = new QuestionsList("All of the following describes the function of roots EXCEPT", "Absorb water from the soil", "Absorb sugar from the soil", "Absorb minerals from the soil", "Absorb nutrients from the soil", "Absorb sugar from the soil", "");
        final QuestionsList question8 = new QuestionsList("What is the function of a plant's stem?", "To support the plant and transport nutrients and water between the plant's roots and leaves", "To make the plant taller", "To help the plant reproduce", "To keep the plant in the ground", "To support the plant and transport nutrients and water between the plant's roots and leaves", "");
        final QuestionsList question9 = new QuestionsList("A flower’s ________ attract insects so that the plant can be fertilized.", "Ovaries", "Pistils", "Stamens", "Petals", "Petals", "");
        final QuestionsList question10 = new QuestionsList("The male structure of a flower is called", "A stamen", "A pollen", "A pistil", "An ovary", "A stamen", "");
        final QuestionsList question11 = new QuestionsList("When a male and female structure combine, it is called", "Circulation", "Fertilization", "Multiplying", "Sprouting", "Fertilization", "");
        final QuestionsList question12 = new QuestionsList("Sunflowers seem to follow the path of the sun as it travels across the sky during the day. Plants bending toward or following light is a response called:", "Hydrotropism", "Photosynthesis ", "Thigmotropism", "Phototropism", "Phototropism", "");
        final QuestionsList question13 = new QuestionsList("Layer of parenchyma cells that cover the root tip; helps protect root tissues?", "Phloem", "Root cap", "Guard", "Stomata", "Root cap", "");
        final QuestionsList question14 = new QuestionsList("How do seedless vascular plants reproduce?", "By producing spores", "By making seeds", "By making gametes", "By making vascular tissues", "By producing spores", "");
        final QuestionsList question15 = new QuestionsList("Which of the following is the female reproductive structure in a plant?", "Pistil", "Stamen", "Sepal", "Anther", "Pistil", "");


        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);

        return questionsLists;


    }

    private static List<QuestionsList> zoologyQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("The insect stage resembling an adult but lacking wings and certain reproductive structures is a _________.", "Nymph", "Pupa", "Larva", "Caterpillar", "Nymph", "");
        final QuestionsList question2 = new QuestionsList("Some species of fish, including clownfish, are born with the ability to __________.", "Change genotypes", "Grow threadlike tails", "Change sex", "Develop lungs", "Change sex", "");
        final QuestionsList question3 = new QuestionsList("The nostril at the top of the head in whales, dolphins, and porpoises is the _________.", "Rostrum", "Nostrum", "Blowhole", "Pod", "Blowhole", "");
        final QuestionsList question4 = new QuestionsList("The rounded, fat-filled region of a toothed whale's forehead is the __________.", "Fluke", "Brain arc", "Rostrum", "Melon", "Melon", "");
        final QuestionsList question5 = new QuestionsList("What are baby great white sharks called?", "Kits", "Pups", "Kids", "Cubs", "Pups", "");
        final QuestionsList question6 = new QuestionsList("Pandas are relatives to which other type of animal?", "Cats", "Dogs", "Bears", "Raccoons", "Bears", "");
        final QuestionsList question7 = new QuestionsList("Great white sharks have __________ major fins.", "Three", "Two", "Four", "One", "Three", "");
        final QuestionsList question8 = new QuestionsList("To preen is to _________.", "Strut in order to get the attention of the opposite sex.", "Clean, arrange, and oil the feathers.", "Display a dorsal fin above the water line.", "Slap the surface of the water with a fluke.", "Clean, arrange, and oil the feathers.", "");
        final QuestionsList question9 = new QuestionsList("The muscular component of a bird's stomach that contains bits of stone that help to crush food is the _________.", "Cloaca", "Gizzard", "Crop", "Air sac", "Gizzard", "");
        final QuestionsList question10 = new QuestionsList("Which structures found in birds have adapted to assist in flying?", "Cloacae", "Gizzards", "Bills", "Chest muscles", "Chest muscles", "");
        final QuestionsList question11 = new QuestionsList("All fish in the class Chondrichthyes are alike in the _________.", "Food they eat", "Size and form of their teeth", "Shape of their bodies", "Composition of their skeletons", "Composition of their skeletons", "");
        final QuestionsList question12 = new QuestionsList("An animal that depends on its surroundings' sources of heat to regulate its body temperature is a(n)", "Endotherm", "Ectotherm", "Flightless bird", "Endoderm", "Ectotherm ", "");
        final QuestionsList question13 = new QuestionsList("The dorsal part of a turtle's shell is the __________.", "Carapace", "Plastron", "Amnion", "Allantois", "Carapace", "");
        final QuestionsList question14 = new QuestionsList("Where do animals get their supply of phosphorus?", "Soil", "Atmosphere", "Water", "Plants", "Plants", "");
        final QuestionsList question15 = new QuestionsList("Which adaptation is NOT characteristic of reptiles?", "Gills", "Lungs", "Scaly skin", "Amniotic egg", "Gills", "");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);

        return questionsLists;

    }

    private static List<QuestionsList> geneticsQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("A dog gives birth to 5 puppies. What percentage of the chromosomes does each puppy share with the mother?", "25%", "50%", "75%", "100%", "50%", "");
        final QuestionsList question2 = new QuestionsList("What does heterozygous mean?", "An organism that has the same genes for a trait (TT or tt)", "An organism that has different genes for a trait (Tt)", "When neither gene is fully dominant; offspring is a mixture of both", "the different forms of a trait (hair color--> brown, blonde, red", "An organism that has different genes for a trait (Tt)", "");
        final QuestionsList question3 = new QuestionsList("Which of the following cell types is formed by meiosis?", "Muscle cells", "Skin cells", "Sperm cells", "Blood cells", "Sperm cells", "");
        final QuestionsList question4 = new QuestionsList("Incomplete dominance means that the traits are", "Expressed equally", "Dominant", "Recessive", "Blended", "Blended", "");
        final QuestionsList question5 = new QuestionsList("Term for homozygous organisms that display two dominant phenotypes at the same time", "Codominance", "Incomplete dominance", "Multiple alleles", "Linked genes", "Codominance", "");
        final QuestionsList question6 = new QuestionsList("What is a phenotype?", "The expression of a trait; what you see.", "Refers to the genetic makeup of an individual", "An organism that has the same genes for a trait (ex. TT or tt)", "The passing of traits from parent to offspring", "The expression of a trait; what you see.", "");
        final QuestionsList question7 = new QuestionsList("Genetic make-up or the inherited combination of alleles is known as the offspring's", "Heredity", "Phenotype", "Genotype", "Redigree", "Genotype", "");
        final QuestionsList question8 = new QuestionsList("An organism's appearance is known as its", "Heredity", "Phenotype", "Genotype", "Pedigree", "Phenotype", "");
        final QuestionsList question9 = new QuestionsList("Sex cells are produced through the process of", "Mitosis", "Cytokinesis", "Binary fission", "Meiosis", "Meiosis", "");
        final QuestionsList question10 = new QuestionsList("The father of genetics that first worked with different characteristics of pea plants.", "Gregor Mendel", "Aristotle", "Robert Hooke", "Antonio Griezman", "Gregor Mendel", "");
        final QuestionsList question11 = new QuestionsList("Structures in a cell that contain genetic information.threadlike structures made of DNA molecules that contain the genes", "Chromosomes", "Ribosomes", "Pea plants", "Snapdragon flower", "Chromosomes", "");
        final QuestionsList question12 = new QuestionsList("Product of reproduction, a new organism produced by one or more parents", "Offspring", "Cell", "Tissue", "DNA", "Offspring", "");
        final QuestionsList question13 = new QuestionsList("A characteristic passed from parents to their offspring", "Heredity", "Allele", "Dominant trait", "Recessive trait", "Heredity", "");
        final QuestionsList question14 = new QuestionsList("Control center of the cell. Contains DNA.", "Nucleus", "Mitochondria", "Lysosome", "Chloroplast", "Nucleus", "");
        final QuestionsList question15 = new QuestionsList("A tool used to help determine the probability of the outcome in a genetic cross", "Punnet square", "Pedigree", "Cladogram", "Dichotomous key", "Punnet square", "");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);


        return questionsLists;

    }

    private static List<QuestionsList> evolutionQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Which statement best describes evolution?", "Evolution is a predictable change from simple to complex organisms.", "Evolution is a process of change through time.", "Evolution often proceeds from complex to simpler organisms.", "Evolution causes organisms to develop characteristics they needed.", "Evolution is a process of change through time.", "");
        final QuestionsList question2 = new QuestionsList("Who developed the Theory of Evolution and wrote the book The Origin of Species?", "Charles Dickens", "Charles Darwin", "Charles Beagle", "Isaac Newton", "Charles Darwin", "");
        final QuestionsList question3 = new QuestionsList("Important evidence for evolution can be found in", "Mutations", "Nature", "Plants", "Fossila", "Fossils", "");
        final QuestionsList question4 = new QuestionsList("Survival of the fittest or when favorable adaptations reproduce faster is called what?", "Natural selection", "Evolution", "Adaptation", "Selective breeding", "Natural selection", "");
        final QuestionsList question5 = new QuestionsList("The theory that life could spring from nonliving matter is _________.", "Spontaneous generation", "Asexual reproduction", "Homeostasis", "Stimulus/ response", "Spontaneous generation", "");
        final QuestionsList question6 = new QuestionsList("The process in which a species becomes better suited to its environment is", "Natural selection", "Adaptation", "Niche", "Selective breeding", "Adaptation", "");
        final QuestionsList question7 = new QuestionsList("The two scientists responsible for the theory of evolution are", "Mendel and Wallace", "Mendel and Darwin", "Darwin and Wallace", "Darwin and Mendell", "Darwin and Wallace", "");
        final QuestionsList question8 = new QuestionsList("Which adaptation enables organisms to be hidden or disguised in their surroundings, possibly providing an advantage?", "Mimicry", "Camouflage", "Mutation", "Evolution", "Camouflage", "");
        final QuestionsList question9 = new QuestionsList("Which term refers to an adaptation where evolving a similar appearance to a different species provides various advantages, like protection?", "Mutation", "Camouflage", "Mimicry", "Fitness", "Mimicry", "");
        final QuestionsList question10 = new QuestionsList("New species can form in what type of evolution?", "Speciation", "Divergent evolution", "Convergent evolution", "None of the above", "Speciation", "");
        final QuestionsList question11 = new QuestionsList("The evolutionary advancement shared by all primates enabling them to use tools and grab items is a(n) __________.", "Opposable thumb", "Opposable lung", "Larger brain", "Iron hook", "Opposable thumb", "");
        final QuestionsList question12 = new QuestionsList("A preserved remain or trace of a once-living organism is a __________.", "Bone", "Fossil", "Prehistoric", "Skeleton", "Fossil", "");
        final QuestionsList question13 = new QuestionsList("What are traits that are altered by an individual organism called?", "Acquired characteristics", "Inherited characteristics", "Heritable traits", "Inherited traits", "Inherited traits", "");
        final QuestionsList question14 = new QuestionsList("It is the belief of many scientists that birds descended from", "Mammals", "Dinosaurs", "Snakes", "Amphibians", "Dinosaurs", "");
        final QuestionsList question15 = new QuestionsList("Is the result of separating a population by means of a physical barrier, leading to the evolution of two or more populations.", "Genetic drift", "Sympatric speciation", "Physiological adaptation", "Allopatric speciation", "Allopatric speciation", "");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case  "botany":
                return botanyQuestions();
            case "zoology":
                return zoologyQuestions();
            case "genetics":
                return geneticsQuestions();
            case "evolution":
                return evolutionQuestions();
        }
        return null;
    }
}
