package animal.classification.land.quadruped.leaf;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

import animal.classification.land.quadruped.Quadruped;

/** QuadrupedLeaf.
 * Kelas yang menangani hewan dengan habitat = "Land"
 * leg = 4 dan diet = "Plant"
 */

public abstract class QuadrupedLeaf extends Quadruped {
  /** Constructor.
   * Melakukan inisialisasi kelas QuadrupedLeaf
   * @param w untuk weight
   * @param x untuk koordinat x pada map
   * @param y untuk koordinat y pada map
   * @param tame true jika jinak, false jika tidak jinak
   */

  public QuadrupedLeaf(float w, int x, int y, boolean tame) {
    super(w, x, y, tame);
    setType("Herbivore");
    setDiet("Leaf");
  }
}
