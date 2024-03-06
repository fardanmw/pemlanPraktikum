package Perpustakaan;

public class PusatDataPerpustakaan {

    public String[][] programming = {
            {"Java Programming 101", "John Programmer", "300"},
            {"Python Programming for Data Science", "Jane Coder", "250"},
            {"Introduction to Machine Learning", "David Coder", "200"},
            {"Web Development Fundamentals", "Emily Coder", "180"},
            {"Essentials of Cybersecurity", "Michael Coder", "220"}
        };
        
        public String[][] philosophy = {
            {"The Art of Meditation", "Marcus Artist", "200"},
            {"Sophie's Philosophical Journey", "Jostein Thinker", "400"},
            {"Philosophical Reflections", "Plato Philosopher", "350"},
            {"Beyond Thoughts and Morality", "Friedrich Thinker", "280"},
            {"Exploring Pure Reason", "Immanuel Philosopher", "500"}
        };
        
        public String[][] history = {
            {"People's Story of the World", "Howard Historian", "700"},
            {"Origins of Societies", "Jared Historian", "550"},
            {"Human Odyssey", "Yuval Historian", "400"},
            {"The Chronicles of World Events", "William Historian", "1000"},
            {"Journeys on the Silk Roads", "Peter Historian", "800"}
        };
        
        public String[][] religion = {
            {"The Prophet's Journey", "Ibn Religious", "300"},
            {"In Search of Spiritual Footsteps", "Tariq Spiritual", "250"},
            {"Mecca: A Spiritual Road", "Muhammad Spiritual", "400"},
            {"Islamic History in Brief", "Karen Religious", "200"},
            {"Muhammad: A Life in Sources", "Martin Spiritual", "380"}
        };
        
        public String[][] psychology = {
            {"Meaningful Existence", "Viktor Psychologist", "200"},
            {"Thoughts in Motion", "Daniel Psychologist", "500"},
            {"The Habitual Mind", "Charles Psychologist", "300"},
            {"Persuasive Psychology", "Robert Psychologist", "250"},
            {"Quiet Minds", "Susan Psychologist", "350"}
        };
        
        public String[][] politics = {
            {"Discovering Indonesia", "Elizabeth Politician", "400"},
            {"Political Dynamics: Indonesia-Malaysia", "Amitav Politician", "250"},
            {"Kings and Citizens in the Archipelago", "Taufik Politician", "300"},
            {"Islam and Politics in Indonesia", "Zachary Political", "280"},
            {"Legal Insights into Indonesia", "Tim Legal", "350"}
        };
        
        public String[][] fiction = {
            {"To Inspire a Mockingbird", "Harper Inspirer", "336"},
            {"Year 2050", "George Futurist", "328"},
            {"The Amazing Gatsby", "F. Fantastic", "180"},
            {"Wizardry and Philosophy", "J.K. Wizard", "320"},
            {"Epic Adventures of the Ring", "J.R.R. Epic Writer", "1178"}
        };
        
    
public String getInformasiBuku(int kodeBuku) {
    String informasi = "";
    
    switch (kodeBuku) {
        case 1:
            informasi = "\nKategori: Teknologi\n";
            informasi += "========================\n";
            for (String[] buku : programming) {
                informasi += "Judul: " + buku[0] + "\n";
                informasi += "Pengarang: " + buku[1] + "\n";
                informasi += "Jumlah Halaman: " + buku[2] + "\n\n";
            }
            break;
        case 2:
            informasi = "Kategori: Filsafat\n";
            informasi += "========================\n";
            for (String[] buku : philosophy) {
                informasi += "Judul: " + buku[0] + "\n";
                informasi += "Pengarang: " + buku[1] + "\n";
                informasi += "Jumlah Halaman: " + buku[2] + "\n\n";
            }
            break;
        case 3:
            informasi = "Kategori: Sejarah\n";
            informasi += "========================\n";
            for (String[] buku : history) {
                informasi += "Judul: " + buku[0] + "\n";
                informasi += "Pengarang: " + buku[1] + "\n";
                informasi += "Jumlah Halaman: " + buku[2] + "\n\n";
            }
            break;
        case 4:
            informasi = "Kategori: Agama\n";
            informasi += "========================\n";
            for (String[] buku : religion) {
                informasi += "Judul: " + buku[0] + "\n";
                informasi += "Pengarang: " + buku[1] + "\n";
                informasi += "Jumlah Halaman: " + buku[2] + "\n\n";
            }
            break;
        case 5:
            informasi = "Kategori: Psikologi\n";
            informasi += "========================\n";
            for (String[] buku : psychology) {
                informasi += "Judul: " + buku[0] + "\n";
                informasi += "Pengarang: " + buku[1] + "\n";
                informasi += "Jumlah Halaman: " + buku[2] + "\n\n";
            }
            break;
        case 6:
            informasi = "Kategori: Politik\n";
            informasi += "========================\n";
            for (String[] buku : politics) {
                informasi += "Judul: " + buku[0] + "\n";
                informasi += "Pengarang: " + buku[1] + "\n";
                informasi += "Jumlah Halaman: " + buku[2] + "\n\n";
            }
            break;
        case 7:
            informasi = "Kategori: Fiksi\n";
            informasi += "========================\n";
            for (String[] buku : fiction) {
                informasi += "Judul: " + buku[0] + "\n";
                informasi += "Pengarang: " + buku[1] + "\n";
                informasi += "Jumlah Halaman: " + buku[2] + "\n\n";
            }
            break;
        default:
            informasi = "Invalid.";
            break;
    }
    
    return informasi;
}
    }
