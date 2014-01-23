package matz.agentsim;

/**情報エージェントからなるネットワークを張るためのビルダ・インターフェース．<br />
 * 情報エージェント配列を受け取り，各エージェントに隣接リストを与えたものを返すようなメソッドbuild()を実装する．
 * @author Matsuzawa
 *
 */
public interface InfoNetworkBuilder {
	final boolean DIRECTED = true;
	final boolean UNDIRECTED = false;
	InfoAgent[] build(InfoAgent[] infoAgentsArray);
}