import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    Int num; 
    num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero correspondente ao seu signo" +"\n 1 - Áries" +"\n 2 - Touro"+  "\n 3 - Gêmeos"+"\n 4 - Câncer"+ "\n 5 - Leão"+"\n 6 - Peixes "+ "\n 7 - Virgem" +"\n 8 - Libra" +"\n 9 - Escorpião" + "\n 10 - Sagitário" + "\n 11 - Capricórnio " +"\n 12 - Aquário " ));                                 
    switch (num){
      case 1: 
        JOptionPane.showMessageDialog(null, "de 21 março a 20 abril");
      break;
      case 2:
        JOptionPane.showMessageDialog(null, "de 21 abril a 20 maio");
        break;
      case 3:
        JOptionPane.showMessageDialog(null, "de 21 maio a 20 junho");
        break;
      case 4:
        JOptionPane.showMessageDialog(null, "de 21 junho a 22 julho");
        break;
      case 5:
         JOptionPane.showMessageDialog(null, "de 23 julho a 22 agosto");
       break;
      case 6:
        JOptionPane.showMessageDialog(null, "de 19 fevereiro a 20 março");
       break;
      case 7:
        JOptionPane.showMessageDialog(null, "de 23 agosto a 22 setembro");
       break;
      case 8:
        JOptionPane.showMessageDialog(null, "de 23 setembro a 22 outubro");
        break;
      case 9:
        JOptionPane.showMessageDialog(null, "de 23 outubro a 21 novembro");
        break;
      case 10:
        JOptionPane.showMessageDialog(null, "de 22 novembro a 21 dezembro");
        break;
      case 11:
        JOptionPane.showMessageDialog(null, "de 22 dezembro a 20 janeiro");
      break;
      case 12:
        JOptionPane.showMessageDialog(null, "de 21 janeiro a 18 fevereiro");
      break;
      default:
        JOptionPane.showMessageDialog(null, "Valor inválido");
        break;
    }
  
    
  }
}