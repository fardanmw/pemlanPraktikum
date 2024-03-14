package Perpustakaan;
import java.util.Scanner;
public class PusatDataPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan("Judul Dasar", "Penulis Dasar", 0, "Sinopsis Dasar");
    
        Scanner sc = new Scanner(System.in);
        String informasi = "";
        int kodeBuku;
        do {

    System.out.println("========================PERPUSTAKAAN FILKOM========================\n");
    System.out.printf("HALO, SELAMAT DATANG DI PERPUSTAKAAN FILKOM: \nTerdapat beberapa jenis buku di perpustakaan ini, yaitu:\n 1. Teknologi\n 2. Filsafat\n 3. Sejarah\n 4. Agama\n 5. Politik\n 6. Fiksi\n 7. psikologi \n 8.keluar dari perpustakaan  \n \nmasukkan nomor buku yang ingin anda cari : ");
      
     
    kodeBuku = sc.nextInt();
    switch (kodeBuku) {
        case 1:
    Perpustakaan buku1Teknologi = new Perpustakaan("Java Programming 101", "John Programmer", 300, "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Quod repudiandae officiis facere beatae. Error voluptatibus suscipit ipsa officia quaerat atque repellat, laborum praesentium dolores nisi architecto hic corrupti, optio quidem.");
    Perpustakaan buku2Teknologi = new Perpustakaan("Python Programming for Data Science", "Jane Coder", 250, "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Quod repudiandae officiis facere beatae. Error voluptatibus suscipit ipsa officia quaerat atque repellat, laborum praesentium dolores nisi architecto hic corrupti, optio quidem.");
    Perpustakaan buku3Teknologi = new Perpustakaan("Introduction to Machine Learning", "David Coder", 200, "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Quod repudiandae officiis facere beatae. Error voluptatibus suscipit ipsa officia quaerat atque repellat, laborum praesentium dolores nisi architecto hic corrupti, optio quidem.");
    Perpustakaan buku4Teknologi = new Perpustakaan("Web Development Fundamentals", "Emily Coder", 180, "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Quod repudiandae officiis facere beatae. Error voluptatibus suscipit ipsa officia quaerat atque repellat, laborum praesentium dolores nisi architecto hic corrupti, optio quidem.");
    Perpustakaan buku5Teknologi = new Perpustakaan("Essentials of Cybersecurity", "Michael Coder", 220, "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Quod repudiandae officiis facere beatae. Error voluptatibus suscipit ipsa officia quaerat atque repellat, laborum praesentium dolores nisi architecto hic corrupti, optio quidem.");
    Perpustakaan[] bukuArrayTeknologi = {buku1Teknologi, buku2Teknologi, buku3Teknologi, buku4Teknologi, buku5Teknologi};
    perpus.kategori(bukuArrayTeknologi);
    break;

        
    case 2:
    Perpustakaan buku1Politik = new Perpustakaan("Discovering Indonesia", "Elizabeth Politician", 400, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku2Politik = new Perpustakaan("Political Dynamics: Indonesia-Malaysia", "Amitav Politician", 250, "Laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku3Politik = new Perpustakaan("Kings and Citizens in the Archipelago", "Taufik Politician", 300, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku4Politik = new Perpustakaan("Islam and Politics in Indonesia", "Zachary Political", 280, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku5Politik = new Perpustakaan("Legal Insights into Indonesia", "Tim Legal", 350, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan[] bukuArrayPolitik = {buku1Politik, buku2Politik, buku3Politik, buku4Politik, buku5Politik};
    perpus.kategori(bukuArrayPolitik);
    break;

        
    case 3:
    Perpustakaan buku1Sejarah = new Perpustakaan("People's Story of the World", "Howard Historian", 700, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku2Sejarah = new Perpustakaan("Origins of Societies", "Jared Historian", 550, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quod repudiandae officiis facere beatae. Error voluptatibus suscipit ipsa officia quaerat atque repellat, laborum praesentium dolores nisi architecto hic corrupti, optio quidem.");
    Perpustakaan buku3Sejarah = new Perpustakaan("Human Odyssey", "Yuval Historian", 400, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku4Sejarah = new Perpustakaan("The Chronicles of World Events", "William Historian", 1000, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku5Sejarah = new Perpustakaan("Journeys on the Silk Roads", "Peter Historian", 800, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan[] bukuArraySejarah = {buku1Sejarah, buku2Sejarah, buku3Sejarah, buku4Sejarah, buku5Sejarah};
    perpus.kategori(bukuArraySejarah);
    break;

        
    case 4:
    Perpustakaan buku1Agama = new Perpustakaan("The Prophet's Journey", "Ibn Religious", 300, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku2Agama = new Perpustakaan("In Search of Spiritual Footsteps", "Tariq Spiritual", 250, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quod repudiandae officiis facere beatae. Error voluptatibus suscipit ipsa officia quaerat atque repellat, laborum praesentium dolores nisi architecto hic corrupti, optio quidem.");
    Perpustakaan buku3Agama = new Perpustakaan("Mecca: A Spiritual Road", "Muhammad Spiritual", 400, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku4Agama = new Perpustakaan("Islamic History in Brief", "Karen Religious", 200, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku5Agama = new Perpustakaan("Muhammad: A Life in Sources", "Martin Spiritual", 380, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan[] bukuArrayAgama = {buku1Agama, buku2Agama, buku3Agama, buku4Agama, buku5Agama};
    perpus.kategori(bukuArrayAgama);
    break;

    case 5:
    Perpustakaan buku1Psikologi = new Perpustakaan("Psychology and Life", "Philip G. Zimbardo", 220, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku2Psikologi = new Perpustakaan("The Psychology Book", "Nigel Benson", 410, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku3Psikologi = new Perpustakaan("Mindset: The New Psychology of Success", "Carol S. Dweck", 380, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku4Psikologi = new Perpustakaan("Influence: Science and Practice", "Robert B. Cialdini", 270, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku5Psikologi = new Perpustakaan("The Body Keeps the Score: Brain, Mind, and Body in the Healing of Trauma", "Bessel van der Kolk", 320, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan[] bukuArrayPsikologi = {buku1Psikologi, buku2Psikologi, buku3Psikologi, buku4Psikologi, buku5Psikologi};
    perpus.kategori(bukuArrayPsikologi);
    break;

    case 6:
    Perpustakaan buku1Filsafat = new Perpustakaan("The Art of Meditation", "Marcus Artist", 200, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku2Filsafat = new Perpustakaan("Sophie's Philosophical Journey", "Jostein Thinker", 400, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku3Filsafat = new Perpustakaan("Philosophical Reflections", "Plato Philosopher", 350, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku4Filsafat = new Perpustakaan("Beyond Thoughts and Morality", "Friedrich Thinker", 280, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku5Filsafat = new Perpustakaan("Exploring Pure Reason", "Immanuel Philosopher", 500, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan[] bukuArrayFilsafat = {buku1Filsafat, buku2Filsafat, buku3Filsafat, buku4Filsafat, buku5Filsafat};
    perpus.kategori(bukuArrayFilsafat);
    break;

    case 7:
    Perpustakaan buku1Fiksi = new Perpustakaan("To Inspire a Mockingbird", "Harper Inspirer", 336, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku2Fiksi = new Perpustakaan("Year 2050", "George Futurist", 328, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku3Fiksi = new Perpustakaan("The Amazing Gatsby", "F. Fantastic", 180, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku4Fiksi = new Perpustakaan("Wizardry and Philosophy", "J.K. Wizard", 320, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan buku5Fiksi = new Perpustakaan("Epic Adventures of the Ring", "J.R.R. Epic Writer", 1178, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
    Perpustakaan[] bukuArrayFiksi = {buku1Fiksi, buku2Fiksi, buku3Fiksi, buku4Fiksi, buku5Fiksi};
    perpus.kategori(bukuArrayFiksi);
    break;
        
    case 8:
     System.out.println("Terima kasih telah menggunakan layanan Perpustakaan kami.");
    break;
    
    default:
    informasi = "Invalid, masukkan kode buku lagi. \n";
    System.out.println(informasi);
    break;
    }
    }while (kodeBuku !=8);
 }
}


