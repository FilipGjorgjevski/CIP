// import Student.java

        class GradeFileManager {
        Student student;
        String filename;
        Student newStudent();
            void saveStudentToFile(Student student, String filename)
            {
                    //first I create the file
                try(
                        File f = new File(filename+".json");
                        f.createFile();
                        )
                catch(e)
                    {
                        System.out.println(e);
                    }

                //then I append to it the student as json
                // I dont remember how to do json conversion so instead this is
                // code how I would append it normally if it wasnt json
                try(
                        FileWriter fw = new FileWriter(filename+".json", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(student);
                        bw.flush();
                        bw.close();
                        )
                catch(e)
                    {
                        System.out.println("Error during writing student object to file");
                    }
            }
            Student loadStudentFromFile(String filename)
            {
                try (
                        FileReader fr = new FileReader(filename+".json", true);
                        BufferedReader br =  new BufferedReader(filename+".json")

                FileWriter fw = new FileWriter(logs.txt, true);
                BufferedWriter bw = new BufferedWriter(fw);

                String line = "";
                while((line = br.readLine()) != null)
                {
                    System.out.println(line);
                }
                        )
           catch (e)
                    {
                        System.out.println("Error during reading student object from file");
                    }
// this is how I would write the student once converted back to object as a log
//                bw.write("StudentID: "+newStudent.studentId + "Grade: "newStudent.finalGrade);
//                bw.flush();
//                bw.close();
//
// and then I would return it
                return newStudent;
            }
        }