package user3;

public class SQL {
	// SQL(외부에서 참조 할 수 있도록 public static 붙임)
	public static final String INSERT_USER3 = "INSERT INTO `User2` VALUES (?,?,?,?)";
	public static final String SELECT_USER3_LIST = "SELECT * FROM `User2`";
	public static final String SELECT_USER3 = "SELECT * FROM `User2` WHERE `uid`=?";
	public static final String UPDATE_USER3 = "UPDATE `User2` SET `name`=?, `birth`=?, `addr`=? "
				+ "where `uid`=?";
	public static final String DELETE_USER3 = "DELETE FROM `user2` WHERE `uid`=?";
}
