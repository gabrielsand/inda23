
# Git basics

Here are some of the most common commands for Git. Try creating a test repository and use the commands to get a feel for how the work.

> ⚠️ Always double check your commands when doing something that could affect other people or is irreversable.️ ⚠️

### Initialization and Cloning

1. [Initialize a Git repository](#1-initialize-a-git-repository)
2. [Clone a remote repository](#2-clone-a-remote-repository)

### Staging and Committing

3. [Add changes to the staging area](#3-add-changes-to-the-staging-area)
4. [Commit changes to the repository](#4-commit-changes-to-the-repository)

### Repository Status and Differences

5. [Check the repository status](#5-check-the-repository-status)
6. [View the differences](#6-view-the-differences)
7. [View the commit history](#7-view-the-commit-history)

### Branches

8. [List all branches](#8-list-all-branches)
9. [Create a new branch](#9-create-a-new-branch)
10. [Switch to a different branch](#10-switch-to-a-different-branch)
11. [Merge branches](#11-merge-branches)

### Remote Repositories

12. [Add a remote repository](#12-add-a-remote-repository)
13. [Push commits to a remote repository](#13-push-commits-to-a-remote-repository)
14. [Pull changes from a remote repository](#14-pull-changes-from-a-remote-repository)
15. [Fetch changes from a remote repository](#15-fetch-changes-from-a-remote-repository)
16. [List remote repositories](#16-list-remote-repositories)

### Other Useful Commands

17. [Remove a file from the staging area](#17-remove-a-file-from-the-staging-area)
18. [Revert a specific commit](#18-revert-a-specific-commit)
19. [Delete a file from the repository](#19-delete-a-file-from-the-repository)
20. [Temporarily save changes](#20-temporarily-save-changes)

---

### 1: Initialize a Git repository

```bash
git init
```

This command initializes a new Git repository in the current directory.

### 2: Clone a remote repository

```bash
git clone <repository>
```

This command creates a local copy of a remote repository on your machine.

### 3: Add changes to the staging area

```bash
git add <file>
```

This command adds a file or changes to the staging area, preparing them for the next commit.

### 4: Commit changes to the repository

```bash
git commit -m <message-in-quotes>
```

This command commits the changes in the staging area to the repository with a descriptive message.

### 5: Check the repository status

```bash
git status
```

This command shows the current status of the repository and any pending changes.

### 6: View the differences

```bash
git diff
```

This command displays the differences between the working directory and the staging area.

### 7: View the commit history

```bash
git log
```

This command displays a log of commits in reverse chronological order.

### 8: List all branches

```bash
git branch
```

This command lists all branches in the repository.

### 9: Create a new branch

```bash
git branch <branch-name>
```

This command creates a new branch with the specified name.

### 10: Switch to a different branch

```bash
git checkout <branch-name>
```

This command switches to the specified branch.

### 11: Merge branches

```bash
git merge <branch-name>
```

This command merges changes from the specified branch into the current branch.

### 12: Add a remote repository

```bash
git remote add <name> <url>
```

This command adds a remote repository with a specified name and URL.

### 13: Push commits to a remote repository

```bash
git push
```

This command pushes local commits to a remote repository.

### 14: Pull changes from a remote repository

```bash
git pull
```

This command fetches and merges changes from a remote repository.

### 15: Fetch changes from a remote repository

```bash
git fetch
```

This command downloads new changes from a remote repository without merging.

### 16: List remote repositories

```bash
git remote -v
```

This command lists all remote repositories and their URLs.

### 17: Remove a file from the staging area

```bash
git reset <file>
```

This command removes a file from the staging area while preserving its changes.

### 18: Revert a specific commit

```bash
git revert <commit>
```

This command reverts a specific commit by creating a new commit with the inverse changes.

### 19: Delete a file from the repository

```bash
git rm <file>
```

This command deletes a file from the working directory and stages the deletion.

### 20: Temporarily save changes

```bash
git stash
```

This command temporarily saves changes that are not ready to be committed.
