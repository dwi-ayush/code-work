import os

def clean_class_files(target_dir="."):
    print(f"Scanning for .class files in: {os.path.abspath(target_dir)}")
    
    count = 0
    # os.walk yields a 3-tuple: (current_path, directories, files)
    for root, dirs, files in os.walk(target_dir):
        for file in files:
            if file.endswith(".class"):
                file_path = os.path.join(root, file)
                try:
                    os.remove(file_path)
                    print(f"Deleted: {file_path}")
                    count += 1
                except OSError as e:
                    print(f"Error deleting {file_path}: {e}")

    print(f"\nCleanup complete. Removed {count} files.")

if __name__ == "__main__":
    clean_class_files()