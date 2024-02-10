import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Array to store correct answers
        String[] correctAnswers = {"Pop", "A STEM Club (Robotics, HOSA, Science Olympiad)", "Kind", "Introverted", "Kindness", "A profession related in CS", "It's just like any other day!"};

        // Array to store student responses
        String[][] studentResponses = {
                {"Ashwin Marwaha", "Junior", "Male", "Rap/Hip Hop/R&B", "A STEM Club (Robotics, HOSA, Science Olympiad)", "Loyal/trustworthy", "Extroverted", "Loyalty/trustworthiness", "A profession related in the medical field", "Hanging out with loved one(s)"},
                {"A. Fuad", "Junior", "Male", "Pop", "A STEM Club (Robotics, HOSA, Science Olympiad)", "Intelligent", "Introverted", "Kindness", "A profession related in CS", "It's just like any other day!"},
                {"Evan Huemmer", "Junior", "Male", "Rap/Hip Hop/R&B", "A sport", "Intelligent", "Introverted", "Kindness", "A profession related in the research field", "It's just like any other day!"},
                {"Abigail Bruce", "Freshmen", "Female", "Kpop/Cpop/Jpop", "An Instrument", "Ambitious", "Introverted", "Ambition", "A profession related in the medical field", "Hanging out with friends"},
                {"Tanisha Golla", "Senior", "Female", "Rap/Hip Hop/R&B", "A STEM Club (Robotics, HOSA, Science Olympiad)", "Ambitious", "Extroverted", "Loyalty/trustworthiness", "A profession related in CS", "It's just like any other day!"},
                {"Ayaam", "Junior", "Male", "Rap/Hip Hop/R&B", "A STEM Club (Robotics, HOSA, Science Olympiad)", "Ambitious", "Extroverted", "Ambition", "A profession related in CS", "It's just like any other day!"},
                {"Mark Man", "Junior", "Male", "Classical", "A STEM Club (Robotics, HOSA, Science Olympiad)", "Intelligent", "Introverted", "Loyalty/trustworthiness", "A profession related in CS", "It's just like any other day!"},
                {"Adhvika Karthik", "Senior", "Female", "Pop", "Non-STEM Clubs or organizations", "Ambitious", "Extroverted", "Loyalty/trustworthiness", "", "Hanging out with friends"},
                {"Dalia", "Junior", "Female", "Pop", "Art", "Loyal/trustworthy", "Introverted", "Loyalty/trustworthiness", "A profession related in the research field", "Hanging out with friends"},
                {"Morgan Isaacson", "Senior", "Female", "Pop", "Non-STEM Clubs or organizations", "Ambitious", "Introverted", "Intellect", "A profession related in the research field", "Hanging out with friends"},
                {"Zoe Wang", "Junior", "Female", "Pop", "Non-STEM Clubs or organizations", "Kind", "Introverted", "Kindness", "A profession related in the research field", "It's just like any other day!"},
                {"Allyson Hoffman", "Junior", "Other", "Alternative Music", "Art", "Kind", "Introverted", "Loyalty/trustworthiness", "A profession related in Humanities", "It's just like any other day!"},
                {"Genevi Kim", "Freshmen", "Female", "Rap/Hip Hop/R&B", "A STEM Club (Robotics, HOSA, Science Olympiad)", "Loyal/trustworthy", "Introverted", "Respect", "A profession related in the medical field", "Hanging out with friends"},
                {"Grace Liu", "Junior", "Female", "Alternative Music", "Art", "Kind", "Introverted", "Kindness", "A profession related in Art", "Hanging out with friends"},
                {"Rasun Abdelrasoul", "Junior", "Female", "Rap/Hip Hop/R&B", "Non-STEM Clubs or organizations", "Intelligent", "Introverted", "Loyalty/trustworthiness", "A profession related in the medical field", "It's just like any other day!"},
                {"Samanyu M", "Junior", "Male", "Kpop/Cpop/Jpop", "Non-STEM Clubs or organizations", "Kind", "Introverted", "Kindness", "A profession related in the medical field", "Hanging out with friends"},
                {"Olivia Mosca", "Junior", "Female", "Alternative Music", "A sport", "Kind", "Extroverted", "Kindness", "A profession related in Humanities", "It's just like any other day!"},
                {"Indu Murugan", "Junior", "Female", "Rap/Hip Hop/R&B", "A STEM Club (Robotics, HOSA, Science Olympiad)", "Ambitious", "Extroverted", "Respect", "A profession related in the medical field", "It's just like any other day!"},
                {"Abby menser", "Junior", "Female", "Pop", "A sport", "Ambitious", "Extroverted", "Kindness", "A profession related in the medical field", "Hanging out with loved one(s)"},
                {"Sophia Snead", "Freshmen", "Female", "", "Art", "Ambitious", "Introverted", "Loyalty/trustworthiness", "A profession related in the medical field", "Hanging out with loved one(s)"},
                {"Dorothy Zhang", "Junior", "Female", "Kpop/Cpop/Jpop", "A sport", "Loyal/trustworthy", "Introverted", "Loyalty/trustworthiness", "A profession related in the medical field", "Hanging out with loved one(s)"},
                {"Steven Gu", "Junior", "Male", "Alternative Music", "A STEM Club (Robotics, HOSA, Science Olympiad)", "Kind", "Introverted", "Kindness", "A profession related in CS", "Hanging out with friends"},
                {"Efia Yeboah", "Junior", "Female", "Rap/Hip Hop/R&B", "Your passion project", "Ambitious", "Extroverted", "Loyalty/trustworthiness", "A profession related in the medical field", "It's just like any other day!"},
                {"Eli McLamb", "Freshmen", "Male", "Musical", "Art", "Intelligent", "Introverted", "Kindness", "A profession related in Humanities", "It's just like any other day!"},
                {"Lensa Osena", "Freshmen", "Female", "Rap/Hip Hop/R&B", "An Instrument", "Loyal/trustworthy", "Introverted", "Intellect", "A profession related in the medical field", "It's just like any other day!"},
                {"Smriti Verma", "Junior", "Female", "Rap/Hip Hop/R&B", "Your passion project", "Loyal/trustworthy", "Introverted", "Loyalty/trustworthiness", "A profession related in the medical field", "Hanging out with friends"},
                {"Ama Mante", "Junior", "Female", "Rap/Hip Hop/R&B", "Non-STEM Clubs or organizations", "Loyal/trustworthy", "Extroverted", "Loyalty/trustworthiness", "A profession related in the medical field", "Hanging out with friends"},
                {"Neal Sengupta", "Junior", "Male", "Classical", "An Instrument", "Intelligent", "Extroverted", "Kindness", "A profession related in Art", "It's just like any other day!"},
                {"Aya Abdalla", "Sophomore", "Female", "Rap/Hip Hop/R&B", "Non-STEM Clubs or organizations", "Loyal/trustworthy", "Extroverted", "Ambition", "A profession related in the medical field", "It's just like any other day!"},
                {"Shrimaan Rapuru", "Freshmen", "Male", "Rap/Hip Hop/R&B", "An Instrument", "Loyal/trustworthy", "Introverted", "Intellect", "A profession related in the medical field", "It's just like any other day!"},
                {"Marnie Lasher", "Sophomore", "Female", "Pop", "A sport", "Intelligent", "Introverted", "Loyalty/trustworthiness", "A profession related in Humanities", "Hanging out with friends"},
                {"Momin Khan", "Sophomore", "Male", "Rap/Hip Hop/R&B", "A sport", "Loyal/trustworthy", "Extroverted", "Loyalty/trustworthiness", "A profession related in engineering", "It's just like any other day!"},
                {"Lakshya Mehta", "Senior", "Male", "Rap/Hip Hop/R&B", "A STEM Club (Robotics, HOSA, Science Olympiad)", "Intelligent", "Extroverted", "Ambition", "A profession related in engineering", "Hanging out with friends"},
                {"Grace Pan", "Sophomore", "Female", "Pop", "A STEM Club (Robotics, HOSA, Science Olympiad)", "Kind", "Introverted", "Kindness", "A profession related in the medical field", "Hanging out with friends"},
                {"Anya Li", "Sophomore", "Female", "Kpop/Cpop/Jpop", "A STEM Club (Robotics, HOSA, Science Olympiad)", "Intelligent", "Introverted", "Intellect", "A profession related in CS", "It's just like any other day!"},
                {"Melina Seng", "Senior", "Female", "Rap/Hip Hop/R&B", "A STEM Club (Robotics, HOSA, Science Olympiad)", "Loyal/trustworthy", "Extroverted", "Loyalty/trustworthiness", "A profession related in CS", "It's just like any other day!"},
                {"Jaya Koneswaran", "Sophomore", "Male", "Kpop/Cpop/Jpop", "An Instrument", "Intelligent", "Extroverted", "Intellect", "A profession related in the medical field", "It's just like any other day!"},
                {"Ashritha Chinapaga", "Sophomore", "Female", "Kpop/Cpop/Jpop", "Art", "Ambitious", "Introverted", "Respect", "A profession related in the medical field", "It's just like any other day!"},
                {"Favour Faleye", "Sophomore", "Female", "Musical", "Your passion project", "Respectful", "Introverted", "Kindness", "A profession related in the research field", "Hanging out with loved one(s)"},
                {"Faith Brennan", "Junior",	"Female", "Kpop/Cpop/Jpop",	"Your passion project",	"Loyal/trustworthy", "Extroverted",	"Loyalty/trustworthiness", "A profession related in the medical field",	"Hanging out with friends"},
                {"Keval Shah", "Senior", "Male", "Pop", "A STEM Club (Robotics, HOSA, Science Olympiad)", "Kind", "Introverted", "Kindness", "A profession related in CS", "It's just like any other day!"},
                {"Caitlyn Espadero", "Junior", "Female", "Pop", "Your passion project", "Kind", "Introverted", "Loyalty/trustworthiness", "A profession related in finance", "Hanging out with loved one(s)"}


                // Add the remaining students' responses here
                // Format: {Name, Grade, Gender, Q1, Q2, Q3, Q4, Q5, Q6, Q7}
        };

        // Calculate and output grades
        double[] percentages = new double[studentResponses.length];
        for (int i = 0; i < studentResponses.length; i++) {
            int correctCount = 0;
            for (int j = 3; j < 10; j++) { // Start from index 3 because responses start from index 3 in each row
                if (studentResponses[i][j].equalsIgnoreCase(correctAnswers[j - 3])) {
                    correctCount++;
                }
            }
            percentages[i] = (double) correctCount / 7 * 100;
            System.out.println(studentResponses[i][0] + " got " + percentages[i] + "% correct.");
        }

        // Output top 4 highest scores along with student names
        System.out.println("\nTop 4 Highest Scores:");
        for (int k = 0; k < 4; k++) {
            double maxPercentage = -1;
            int maxIndex = -1;
            for (int i = 0; i < percentages.length; i++) {
                if (percentages[i] > maxPercentage) {
                    maxPercentage = percentages[i];
                    maxIndex = i;
                }
            }
            if (maxIndex != -1) {
                System.out.println(studentResponses[maxIndex][0] + ": " + maxPercentage + "%");
                percentages[maxIndex] = -1; // Mark the score as already outputted
            }
        }
    }
}

