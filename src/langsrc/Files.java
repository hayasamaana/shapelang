package langsrc;

/**
 * Utility operations on files.
 */
public class Files {

	/**
	 * Get the file extension.
	 * @param file The File from which to get the extension
	 * @return filename extension
	 */
	public static String getFileExtension(final java.io.File file) {
		if (file.isDirectory()) {
			return "";
		}
		final String name = file.getName();
		return name.substring(name.lastIndexOf('.') + 1);
	}

	/**
	 * Returns the filename extension from a path.
	 * @param path file path
	 * @return filename extension
	 */
	public static String getFileExtension(final String path) {
		return getFileExtension(new java.io.File(path));
	}

	/**
	 * Remove the filename extension from a path.
	 * @param path file path
	 * @return path without the filename extension
	 */
	public static String removeFileExtension(final String path) {
		return path.substring(0, path.lastIndexOf('.'));
	}

	
	/**
	 * Add a file extension to a path.
	 * @param path file path
	 * @param extension the extension to add
	 */
	public static String addFileExtension(final String path, final String extension) {
		return path + '.' + extension;
	}
}
