package animal.real;

import animal.classification.land.biped.fruit.Primata;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

/**
 * Gorilla.
 * Hewan primata yang berukuran besar
 */
public class Gorilla extends Primata {
  /**
   * Melakukan inisialisasi kelas Gorilla dengan parameter absis dan ordinat lokasi.
   *
   * @param i Absis
   * @param j Ordinat
   */
  public Gorilla(int i, int j) {
    super(200, i, j, false);
    setContent('F');
    setName("Gorilla");
    consumerate += getFodder();
  }

  /**
   * Menghasilkan suara hewan yang khas.
   *
   * @return string suara hewan.
   */
  public String interact() {
    return "Huhahuha";
  }
}
