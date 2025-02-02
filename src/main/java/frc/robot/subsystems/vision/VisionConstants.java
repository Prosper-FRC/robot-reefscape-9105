package frc.robot.subsystems.vision;

import edu.wpi.first.math.VecBuilder;
import edu.wpi.first.math.Vector;
import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.math.geometry.Transform3d;
import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.math.numbers.N3;
import edu.wpi.first.wpilibj.RobotBase;

public class VisionConstants {
    // From CAD and decided by you in configuration
    public static final String kLeftCamName = "9105_LEFT";
    public static final Transform3d kLeftCamTransform = new Transform3d(
        new Translation3d(1.0, 1.0, 1.0),
        new Rotation3d(1.0, 1.0, 1.0)
    );

    public static final String kRightCamName = "9105_RIGHT";
    public static final Transform3d kRightCamTransform = new Transform3d(
        new Translation3d(1.0, 1.0, 1.0),
        new Rotation3d(1.0, 1.0, 1.0)
    );

    // Change the transform depending on which camera it is switched over to //
    public static final String kBackupCamName = "9105_BACKUP";
    public static final Transform3d kBackupCamTransform = new Transform3d(
        new Translation3d(1.0, 1.0, 1.0),
        new Rotation3d(1.0, 1.0, 1.0)
    );

    // TODO: SET TO FALSE UNLESS YOU ACTUALLY KNOW WHAT THIS DOES
    // This turns on a implementation of Rembrandts single tag vision algorithm
    public static final boolean KUseSingleTagTransform = true;

    //TODO: TUNE
    public static final Vector<N3> kSingleStdDevs = (RobotBase.isReal()) ?
        VecBuilder.fill(0.01, 0.01, 5.0) : VecBuilder.fill(0.01, 0.01, 5.0);
    public static final Vector<N3> kMultiStdDevs = (RobotBase.isReal()) ?
        VecBuilder.fill(0.01, 0.01, 5.0) : VecBuilder.fill(0.01, 0.01, 5.0);

    public static final double kAmbiguityThreshold = (RobotBase.isReal()) ? 0.2 : 1.0;
}